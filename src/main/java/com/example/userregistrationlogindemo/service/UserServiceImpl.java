package com.example.userregistrationlogindemo.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userregistrationlogindemo.model.Role;
import com.example.userregistrationlogindemo.model.User;
import com.example.userregistrationlogindemo.repository.UserRepository;
import com.example.userregistrationlogindemo.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}



	@Override
	public User save(UserRegistrationDto registrationDto) {
		
		User user = new User( 
				registrationDto.getFirstName(),
				registrationDto.getLastName(),
				registrationDto.getEmail(),
				registrationDto.getPassword(), Arrays.asList(new Role("Role_User"))
				);
				
		return userRepository.save(user);
	}
	
}
