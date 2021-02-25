package com.cognizant.ormlearn.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService depService;
	
	@GetMapping("/departments")
	public ArrayList<Department> getAllDepartments(){
		return depService.getAllDepartments();
	}
	
}
