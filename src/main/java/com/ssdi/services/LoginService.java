package com.ssdi.services;

import java.util.List;

import com.ssdi.dto.User;

public interface LoginService {

	void save(User user);
	
	List<User> findAll();
	
	User findOne(String email);
}
