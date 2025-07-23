package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Office;
import com.example.demo.services.OfficeService;

@RestController
@RequestMapping("/office")
public class OfficeController {
	@Autowired
	OfficeService oserv;
	
	@GetMapping("/all")
	public List<Office> getAll()
	{
		return oserv.getAll();
	}
	
	//2
	@GetMapping("/getone")
	public Office getOne(@RequestParam("officeCode") String officeCode)
	{
		return oserv.getOne(officeCode);
		
	}
	
	@GetMapping("/getbycountry")
	public List<Office> getbycountry(@RequestParam("country") String country)
	{
		return oserv.getByCountry(country);
	}
}
