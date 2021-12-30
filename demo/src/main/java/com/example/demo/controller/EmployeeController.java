package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Trainee;
import com.example.demo.repository.EmployeeRepository;


@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeRepository repository;
	@GetMapping("/Getemployee")
	public List<Trainee>getAllEmployees()
	{
		return repository.findAll();
	}

}
