package com.ok.example.h2example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ok.example.h2example.entity.User;
import com.ok.example.h2example.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public User addUser(User user) {		
		return userRepository.save(user);
	}
	
	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User updateUserById(Long id) {
		User user = this.userRepository.findByUserId(id);
		user.setPassword("NewPassword");
		return this.userRepository.save(user);
	}

	@Override
	public User deleteUserById(Long id) {
		User user = this.userRepository.findByUserId(id);
		this.userRepository.delete(user);
		return user;
	}
	
	

}
