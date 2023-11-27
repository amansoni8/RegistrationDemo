package com.example.userregistrationlogindemo.service;
import com.example.userregistrationlogindemo.model.User;
import com.example.userregistrationlogindemo.web.dto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto registrationDto);
	}
