package com.springframework.mvc.service;

import com.springframework.mvc.bean.Employee;
import com.springframework.mvc.dao.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDao dao;
	
	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}

	public Boolean insertData(Employee employee) {
		return dao.insertData(employee);
	}

}
