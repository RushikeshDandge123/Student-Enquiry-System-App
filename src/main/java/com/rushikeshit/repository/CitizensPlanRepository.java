package com.rushikeshit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rushikeshit.entity.CitizensPlan;

public interface CitizensPlanRepository extends JpaRepository<CitizensPlan, Integer> {

	
	@Query("Select distinct(planName) from CitizensPlan")
	public List<String> getPlanName();
	
	@Query("Select distinct(planStatus) from CitizensPlan")
	public List<String> getPlanStatus();
}
