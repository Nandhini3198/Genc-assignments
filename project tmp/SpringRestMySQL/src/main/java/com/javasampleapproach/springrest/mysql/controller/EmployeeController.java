package com.javasampleapproach.springrest.mysql.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.javasampleapproach.springrest.mysql.model.Employee;
import com.javasampleapproach.springrest.mysql.repo.EmployeeRepository;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/app")
public class EmployeeController {
 
	
	@Autowired
	EmployeeRepository repository;
	
	@GetMapping("/emp")
	public List<Employee> getAllEmployee() {
		System.out.println("Get all Employees");

		List<Employee> employee = new ArrayList<>();
		repository.findAll().forEach(employee::add);

		return employee;
	}

	@PostMapping(value = "/employee/create")
	public Employee postEmployee(@RequestBody Employee employee) {

		Employee _employee = repository.save(new Employee(employee.getName(), employee.getAge()));
		return _employee;
	}

}
