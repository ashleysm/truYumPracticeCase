package com.cognizant.ormlearn.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.EmployeeNotFoundException;
import com.cognizant.ormlearn.service.EmployeeService;

@RestController
public class EmployeeController {

	
	@Autowired
	EmployeeService empService;
	
	@GetMapping("/employees")
	public ArrayList<Employee> getAllEmployeeList(){

		return empService.getAllEmployees();
	}
	
	@PostMapping("/updateEmployee")
	public void updatEmployee(@RequestBody @Valid Employee emp ) throws EmployeeNotFoundException {
		empService.updateEmployee(emp);
		
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public void deleteEmpoyee(@PathVariable int id) throws EmployeeNotFoundException {
		empService.deleteEmployee(id);
		
	}
	
}
