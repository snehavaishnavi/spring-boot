package com.ssdi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssdi.dto.User;
import com.ssdi.repository.LoginRepository;

@Component("LoginService")
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginRepository loginRepository;
	
	public void save(User user) {
		loginRepository.save(user);
	}

	public User findOne(String email) {
		return loginRepository.findOne(email);
	}
	
	public List<User> findAll() {
		return loginRepository.findAll();
	}
	

}
