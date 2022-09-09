package com.jwt.afrilife.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jwt.afrilife.request.SignupDto;

@Component
public interface UserService {
	
	public ResponseEntity<?> enrollment(SignupDto signupdto);
	

}