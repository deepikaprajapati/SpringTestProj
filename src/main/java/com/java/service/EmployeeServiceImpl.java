package com.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.api.Employee;
import com.java.dao.EmployeeDao;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao empDao;
	
	@Transactional
	@Override
	public List<Employee> get() {
	return empDao.get();
	}
@Transactional
	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return empDao.getById(id);
	}
@Transactional
	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		
	}
@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
