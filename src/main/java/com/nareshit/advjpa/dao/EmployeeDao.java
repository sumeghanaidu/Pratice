package com.nareshit.advjpa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nareshit.advjpa.model.Employee;
import com.nareshit.advjpa.model.Publisher;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer>{


	//Abstract Method
	//Input ==> List of  Department Names ==> Sales,Marketing,IT
	//Output ==>
	/*
	 *   Sales 40000
	 *   Marketing 30000
	 *   IT 80000
	 */
	public List<Object[]> findMaxSalariesByDept(List<String> deptNames);
}
