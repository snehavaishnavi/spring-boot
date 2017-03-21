package com.ssdi.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssdi.dto.User;
import com.ssdi.services.LoginService;

@RestController
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public void login(@RequestParam("email") String email, @RequestParam("password") String password) {

		System.out.println("Inside rest controller: "+email +" : "+password);
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		loginService.save(user);
	}
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<User> getAll() {

		return loginService.findAll();
	}

	@RequestMapping(value="/one", method=RequestMethod.GET)
	public User getAll(@RequestParam("email") String email) {

		return loginService.findOne(email);
	}
}
