package com.cognizant.employee.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.employee.Repository.EmployeeRepository;
import com.cognizant.employee.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);
	
	@Transactional
	public Employee get(int id) {
		LOGGER.info("Start");
		return employeeRepository.findById(id).get();

	}
	
	@Transactional
	public void save(Employee employee) {
	LOGGER.info("Start");
	employeeRepository.save(employee);
	LOGGER.info("End");

	}
	
	@Transactional
	public List<Employee> getAllPermanentEmployee(){
		return employeeRepository.getAllPermanentEmployees();
	}
	
	@Transactional
	public double getAvgSalary(int dId) {
		return employeeRepository.getAverageSalary(dId);
	}
	
	@Transactional
	public List<Employee> getAllEmployeeNative(){
		return employeeRepository.getAllEmployeesNative();
	}
	
	
}