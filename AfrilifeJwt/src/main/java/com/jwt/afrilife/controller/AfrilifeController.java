package com.jwt.afrilife.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.afrilife.request.SigninDto;
import com.jwt.afrilife.request.SignupDto;
import com.jwt.afrilife.response.JwtResponse;
import com.jwt.afrilife.security.jwt.JwtUtils;
import com.jwt.afrilife.service.UserService;
import com.jwt.afrilife.serviceImpl.UserDetailsImpl;
import com.jwt.afrilife.serviceImpl.UserDetailsServiceImpl;



@RestController
@RequestMapping("/api/auth")
public class AfrilifeController {
	
	@Autowired
	  AuthenticationManager authenticationManager;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	
	
	 @Autowired
	  JwtUtils jwtUtils;
	 
	 
	 @PostMapping("/signin")
	  public ResponseEntity<?> authenticateUser(@Valid @RequestBody SigninDto signin) {

	    Authentication authentication = authenticationManager.authenticate(
	        new UsernamePasswordAuthenticationToken(signin.getUsername(), signin.getPassword()));

	    SecurityContextHolder.getContext().setAuthentication(authentication);
	    String jwt = jwtUtils.generateJwtToken(authentication);
	    
	    UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();    
	

	    return ResponseEntity.ok(new JwtResponse(jwt, 
	    		userDetails.getId(), 
                userDetails.getChTypeId(), 
                userDetails.getChId(), 
                userDetails.getReportUserId(),
                userDetails.getFirstName(),
                userDetails.getLastName(),
                userDetails.getCountryId(),
                userDetails.getCityId(),
                userDetails.getStateId(),
                userDetails.getPhoneNumber(),
                userDetails.getStatus(),
                userDetails.getUsername(),
                userDetails.getEmail(),
                userDetails.getHierarchy()));  
	  }

	 
	 @PostMapping("/signup")
		public ResponseEntity<?> register(@RequestBody SignupDto signupdto) {
			return userService.enrollment(signupdto);
		}
		
	 
}
