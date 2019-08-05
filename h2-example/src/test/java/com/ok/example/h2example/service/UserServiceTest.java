package com.ok.example.h2example.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.ok.example.h2example.entity.User;
import com.ok.example.h2example.repository.UserRepository;

@RunWith(SpringRunner.class)
public class UserServiceTest {

	@TestConfiguration
	static class UserServiceImplTestContextConfiguration {

		@Bean
		public UserService userService() {
			return new UserServiceImpl();
		}
	}

	@Autowired
	private UserService userService;

	@MockBean
	private UserRepository userRepository;

	@Before
	public void setUp() {
		User user = new User();
		user.setUsername("xyz23345d");
		user.setPassword("xxxxxxxx");
		
		//User result = (User)user.getClone();
		User result = new User();
		result.setUsername(user.getUsername());
		result.setPassword(user.getPassword());
		result.setUserId(1002l);

		Mockito.when(userRepository.save(user)).thenReturn(result);
	}

	@Test
	public void testAddUser() {

		User user = new User();
		// user.setId(10010l);
		user.setUsername("xyz23345d");
		user.setPassword("xxxxxxxx");

		User result = userService.addUser(user);

		assertEquals(user.getUsername(), result.getUsername());
				
		System.out.println(result);
		//User [id=1002, username=xyz23345d, password=xxxxxxxx, userDetails=null]
	}

}
