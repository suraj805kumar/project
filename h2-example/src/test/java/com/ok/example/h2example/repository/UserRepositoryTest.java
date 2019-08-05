package com.ok.example.h2example.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.ok.example.h2example.entity.User;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {
	
	@Autowired
    private TestEntityManager entityManager;
	
	@Autowired
    private UserRepository userRepository;
	
	@Test
	public void testSaveUser() {
		User user = new User();
	
		user.setUsername("xyz23345d");
		user.setPassword("xxxxxxxx");		
		System.out.println(userRepository.save(user));
	}
	
	@Test
	public void testSaveUserUsingTestEntityManager() {
		User user = new User();
	
		user.setUsername("xyz23345d");
		user.setPassword("xxxxxxxx");
		
		System.out.println(entityManager.persistAndFlush(user));
	}
	
	@Test
	public void testAllUser() {
		System.out.println(userRepository.findAll());
	}

}
