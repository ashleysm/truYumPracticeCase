package com.cognizant.ormlearn.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.dao.DepartmentDao;
import com.cognizant.ormlearn.model.Department;

@Service
public class DepartmentService {

	@Autowired
	DepartmentDao depDao;
	
	public ArrayList<Department> getAllDepartments(){
		return depDao.getAllDepartments();
	}
}
