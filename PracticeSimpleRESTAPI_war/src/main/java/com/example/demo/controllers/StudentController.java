package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Student;
import com.example.demo.services.StudentServices;

@RestController
public class StudentController {
	
	@Autowired
	StudentServices sserv;
	
	@GetMapping("/allStud")
	public List<Student> getAll()
	{
		return sserv.getAll();
	}
	
	@GetMapping("/getbyid")
	public Student getstudByid(@RequestParam("id") int id)
	{
		return sserv.getStudentByid(id);
		
	}
	
	@GetMapping("/byid/{id}")
	public Student getByid(@PathVariable("id") int id)
	{
		return sserv.getStudentByid(id);
	}
	
	@PostMapping("/save")
	public Student saveStud(@RequestBody Student stud)
	{
		return sserv.saveStud(stud);
		
	}
	
	@GetMapping("/deleteid")
	public void DeleteData(@RequestParam("id")int id)
	{
		sserv.deleteid(id);
	}
	

	@GetMapping("/update")
	public int updatedata(@RequestParam("id")int id,@RequestParam("city")String city)
	{
		return sserv.updateStud(id,city);
		
	}
}
