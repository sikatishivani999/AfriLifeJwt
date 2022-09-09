package com.jwt.afrilife.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.afrilife.model.Hierarchy;


public interface HierarchyRepository extends JpaRepository<Hierarchy, Long> {
	
	public Hierarchy findByName(String name);

}
