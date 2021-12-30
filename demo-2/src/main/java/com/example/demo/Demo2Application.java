package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@SpringBootApplication
public class Demo2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}
	
	@Autowired
	 EmployeeRepository repository;
	@Override
	public void run(String... args)throws Exception
	{
		this.repository.save(new Employee("ss","dl","dd","dsd"));
		this.repository.save(new Employee("ss","dl2","dd","dsd"));
		this.repository.save(new Employee("ss","dl3","dd","dsd"));
	}

}
