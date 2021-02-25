package com.cognizant.ormlearn.dao;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.EmployeeNotFoundException;

@Component
public class EmployeeDao {

	private static ArrayList<Employee> empList;
	
	public EmployeeDao() {
		ApplicationContext context=new ClassPathXmlApplicationContext("Employee.xml");
		empList=(ArrayList<Employee>)context.getBean("empList");
				
	}
	public ArrayList<Employee> getAllEmployees(){
		return empList;
	}
	
	public void updateEmployee(Employee emp)throws EmployeeNotFoundException{
		for(Employee employee:empList) {
			if(employee.getId()==emp.getId()) {
				empList.remove(employee);
				empList.add(emp);
				return;
				}
		}
		throw new EmployeeNotFoundException();
	}
	
	public void deleteEmployee(int id)throws EmployeeNotFoundException{
		for(Employee employee:empList) {
			if(employee.getId()==id) {
				empList.remove(employee);
				return;
				}
		}
		throw new EmployeeNotFoundException();
	}
}