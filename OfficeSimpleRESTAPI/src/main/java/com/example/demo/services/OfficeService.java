package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Office;
import com.example.demo.repositories.OfficeRepository;

@Service
public class OfficeService {

	@Autowired
	OfficeRepository orepo;
	
	public List<Office> getAll() {
		return orepo.findAll();
	}

//	public Office getOne(String officeCode) {
//		return orepo.findOne();
//	}
	
	public List<Office> getByCountry(String country)
	{
		return orepo.getByCountry(country);
		
	}

	public Office getOne(String officeCode) {
		return orepo.findOne(officeCode);
	}

}
