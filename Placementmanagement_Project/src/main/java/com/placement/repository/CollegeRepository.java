package com.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placement.entity.College;


public interface CollegeRepository extends JpaRepository<College, Integer> {

}
