package com.java.service;

import java.util.List;

import com.java.api.Employee;

public interface EmployeeService {
	List<Employee> get();
	Employee getById(int id);
	void save(Employee emp);
	void delete(int id);
}
