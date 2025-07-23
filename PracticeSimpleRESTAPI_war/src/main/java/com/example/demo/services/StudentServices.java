package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Student;
import com.example.demo.repositories.StudentRepository;

@Service
public class StudentServices {
	
	@Autowired
	StudentRepository srepo;
	
	public List<Student> getAll()
	{
		return srepo.findAll();
		
	}

	public Student getStudentByid(int id) {
		//return srepo.findById(id).get();
		Student s=null;
		Optional<Student> opt=srepo.findById(id);
		try {
			s=opt.get();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return s;
	}

	public Student saveStud(Student s) {
		return srepo.save(s);
	}

	public void deleteid(int id) {
		srepo.deleteById(id);
	}

	public int updateStud(int id, String city) {
		return srepo.updatedata(id,city);
	}
	
}
