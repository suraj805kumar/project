package com.ok.example.h2example.controller;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import static org.mockito.BDDMockito.given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.hamcrest.Matchers;
import org.hamcrest.CoreMatchers;

import com.ok.example.h2example.entity.User;
import com.ok.example.h2example.service.UserService;

@RunWith(SpringRunner.class)
@WebMvcTest(UserRestController.class)
public class UserRestControllerTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private UserService userService;

	@Test
	public void testGetAllUsers() throws Exception {

		User user = new User();
		user.setUsername("xyz23345d");
		user.setPassword("xxxxxxxx");


		List<User> allUsers = Arrays.asList(user);

		given(userService.getAllUser()).willReturn(allUsers);

		mvc.perform(MockMvcRequestBuilders.get("/user/getall").contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isAccepted())
				.andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(1)))
				.andExpect(MockMvcResultMatchers.jsonPath("$[0].username", CoreMatchers.is(user.getUsername())));
	
	}
	
	

}
