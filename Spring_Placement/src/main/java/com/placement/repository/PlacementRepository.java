package com.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placement.entity.Placement;

 
public interface PlacementRepository extends JpaRepository<Placement, Integer> {
	
 
}
