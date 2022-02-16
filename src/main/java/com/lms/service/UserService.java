package com.lms.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.lms.model.User;
import com.lms.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	
	User save(UserRegistrationDto registrationDto);

}
