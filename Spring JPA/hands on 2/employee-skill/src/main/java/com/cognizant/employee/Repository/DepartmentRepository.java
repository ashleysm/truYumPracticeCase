package com.cognizant.employee.Repository;

import org.springframework.stereotype.Repository;

import com.cognizant.employee.model.Department;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>  {

}