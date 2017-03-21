package com.ssdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssdi.dto.User;

public interface LoginRepository extends JpaRepository<User, String>{

}
