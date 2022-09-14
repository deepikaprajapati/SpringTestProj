package com.java.dao;

import java.util.List;

import com.java.api.Employee;

public interface EmployeeDao {
List<Employee> get();
Employee getById(int id);
void save(Employee emp);
void delete(int id);
}
