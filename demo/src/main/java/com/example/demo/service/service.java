package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Trainee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class service {
	@Autowired
	EmployeeRepository repository;
	
	public List<Trainee>getAllEmployees(){
		return repository.findAll();
		
	}
}
