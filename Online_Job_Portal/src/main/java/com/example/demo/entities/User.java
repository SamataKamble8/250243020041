package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int uid;
	String uname;
	String email;
	String phone_no;
	String address;
	int cityid;
	String password;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="rid")
	@JsonIgnoreProperties("user")
	Role role;          //i.e rid -->foreign key
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cityid")
	@JsonIgnoreProperties("user")
	City city;         
}
