package com.jwt.afrilife.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.afrilife.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findById(long id);
	
	Optional<User> findByUsername(String username);
	
	boolean existsByUsername(String username);
	
	boolean existsByEmail(String email);

}
