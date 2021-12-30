package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.student;
import com.example.demo.service.StudentService;



@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	StudentService service;
	@PostMapping("/Enterstudent")
	public void saveStudent(@RequestBody student ss)
	{
	service.saveStudent(ss);
	}
	@GetMapping("/Getstudents")
	public List<student>getAllStudents()
	{
	return service.getAllStudents();
	}
	@GetMapping("/findstudent/{id}")
	public Optional<student> findStudent(@PathVariable String id)
	{
	return service.findStudent(id);
	}
	@PostMapping("/updatestudent/{id}")
	public void updateStudent(@PathVariable String id, @RequestBody student s)
	{
	service.updateStudent(s,id);
	}
	@PostMapping("/deletestudent/{id}")
	public void deleteStudent(@PathVariable String id)
	{
	service.deleteStudent(id);
	}


}
