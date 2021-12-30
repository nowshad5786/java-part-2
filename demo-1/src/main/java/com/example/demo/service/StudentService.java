package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository repository;

	public void saveStudent(student s)
	{
	repository.save(s);
	}

	public List<student>getAllStudents()
	{
	return repository.findAll();
	}


	public Optional<student>findStudent(String id)
	{
	return repository.findById(id);

	}


	public void updateStudent(student s,String id)
	{
	repository.getById(id);
	repository.save(s);
	}



	public void deleteStudent(String id)
	{
	repository.deleteById(id);
	}

}
