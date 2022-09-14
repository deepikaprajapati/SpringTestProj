package com.java.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.api.Employee;
import com.java.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@GetMapping(value="/employee",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> get() {
		return empService.get();
	}
	
	@GetMapping(value="/employeeById/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Employee getById(@PathVariable("id") int id) {
		return empService.getById(id);
	}
}
