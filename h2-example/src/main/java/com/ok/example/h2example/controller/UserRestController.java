package com.ok.example.h2example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ok.example.h2example.entity.User;
import com.ok.example.h2example.service.UserService;

@RestController
@RequestMapping("/user")
public class UserRestController {

	@Autowired
	private UserService userService;

	@PostMapping(value = "/save")
	public ResponseEntity<User> saveUser(@RequestBody final User user) {
		return ResponseEntity.ok().body(this.userService.addUser(user));
	}

	@GetMapping(value = "/getall")
	public ResponseEntity<List<User>> getAllUser() {
		HttpStatus status = HttpStatus.OK;
		//return this.userService.getAllUser();
		return new ResponseEntity<>(this.userService.getAllUser(), status);
	}
	
	@PutMapping(value = "/update/{id}")
	public ResponseEntity<User> updateUser(@PathVariable("id") String id){
		return ResponseEntity.ok().body(this.userService.updateUserById(Long.valueOf(id)));		
	}
	
	@DeleteMapping(value = "/delete")
	public ResponseEntity<User> deleteUser(@RequestParam("id") final String id){
		return ResponseEntity.ok().body(this.userService.deleteUserById(Long.valueOf(id)));		
	}

}
