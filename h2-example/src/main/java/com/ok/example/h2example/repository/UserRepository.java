package com.ok.example.h2example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ok.example.h2example.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User save(User user);
	
	User findByUserId(Long id);

}
