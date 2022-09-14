package com.java.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.api.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private EntityManagerFactory emf;
	private static SessionFactory sessionFactory;
	@Override
	public List<Employee> get() {
		EntityManager em = emf.createEntityManager();
		String qryString ="from Employee";
		Query qry=em.createQuery(qryString);
		List<Employee> list = qry.getResultList();
		return list;
	}

	@Override
	public Employee getById(int id) {
		System.out.println("inside daoImpl");
		EntityManager em = emf.createEntityManager();
		String qryString ="select e from Employee e where e.id=:id ";
		Query qry=em.createQuery(qryString);
		qry.setParameter("id", id);
		Employee emp = (Employee) qry.getSingleResult();
		return emp;
	}

	@Override
	public void save(Employee ep) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
