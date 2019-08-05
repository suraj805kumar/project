package com.ok.example.h2example.service;

import java.util.List;

import com.ok.example.h2example.entity.User;

public interface UserService {

	User addUser(User user);

	List<User> getAllUser();

	User updateUserById(Long valueOf);

	User deleteUserById(Long id);
}
