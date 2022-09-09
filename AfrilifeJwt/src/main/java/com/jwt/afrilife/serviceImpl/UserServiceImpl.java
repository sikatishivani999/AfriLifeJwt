package com.jwt.afrilife.serviceImpl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.jwt.afrilife.model.Hierarchy;
import com.jwt.afrilife.model.User;
import com.jwt.afrilife.repository.HierarchyRepository;
import com.jwt.afrilife.repository.UserRepository;
import com.jwt.afrilife.request.SignupDto;
import com.jwt.afrilife.response.MessageResponse;
import com.jwt.afrilife.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private HierarchyRepository hierarchyRepository;
	
	@Autowired
    private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepo;
	
	public ResponseEntity<?> enrollment(@Valid @RequestBody SignupDto signupdto) {
	    if (userRepo.existsByUsername(signupdto.getUsername())) {
	      return ResponseEntity
	          .badRequest()
	          .body(new MessageResponse("Error: Username is already taken!"));
	    }

	    if (userRepo.existsByEmail(signupdto.getEmail())) {
	      return ResponseEntity
	          .badRequest()
	          .body(new MessageResponse("Error: Email is already in use!"));
	    }

	    User user = new User();
	    
	    user.setChTypeId(signupdto.getChTypeId());
		user.setChId(signupdto.getChId());
		user.setReportUserId(signupdto.getReportUserId());
		user.setFirstName(signupdto.getFirstName());
		user.setLastName(signupdto.getLastName());
		user.setCountryId(signupdto.getCountryId());
		user.setCityId(signupdto.getCityId());
		user.setStateId(signupdto.getStateId());
		user.setPhoneNumber(signupdto.getPhoneNumber());
		user.setStatus(signupdto.getStatus());
		user.setUsername(signupdto.getUsername());
		user.setPassword(passwordEncoder.encode(signupdto.getPassword()));
		user.setEmail(signupdto.getEmail());
		
		Hierarchy hierarchy = hierarchyRepository.findByName(signupdto.getHierarchy());
		user.setHierarchy(new Hierarchy(hierarchy.getId()));

	
	    userRepo.save(user);

	    return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
	  }
		 
		
		
	}


