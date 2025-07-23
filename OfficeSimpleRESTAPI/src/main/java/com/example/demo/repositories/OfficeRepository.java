package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Office;

import jakarta.transaction.Transactional;

@Repository
public interface OfficeRepository extends JpaRepository<Office, Integer> {

	@Transactional
	@Query("From Office o where o.officeCode=:officeCode")
	public Office findOne(String officeCode);

	@Transactional
	@Query("From Office o where o.country=:country")
	public List<Office> getByCountry(String country);

}

