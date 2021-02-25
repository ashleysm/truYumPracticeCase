package com.cognizant.ormlearn.service;

import java.util.ArrayList;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.dao.EmployeeDao;
import com.cognizant.ormlearn.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	
	public ArrayList<Employee> getAllEmployees(){
		return employeeDao.getAllEmployees();
	}
	
	public void updateEmployee(Employee emp)throws EmployeeNotFoundException{
		employeeDao.updateEmployee(emp);
	}
	
	public void deleteEmployee(int id)throws EmployeeNotFoundException{
		employeeDao.deleteEmployee(id);
	}
}
