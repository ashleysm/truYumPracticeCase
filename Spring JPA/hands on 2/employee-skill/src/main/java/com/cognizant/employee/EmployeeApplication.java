package com.cognizant.employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.employee.model.Department;
import com.cognizant.employee.model.Employee;
import com.cognizant.employee.model.Skill;
import com.cognizant.employee.service.DepartmentService;
import com.cognizant.employee.service.EmployeeService;
import com.cognizant.employee.service.SkillService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class EmployeeApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeApplication.class);
	private static EmployeeService employeeService;
	private static DepartmentService departmentService;
	private static SkillService skillService;
	public static void main(String[] args)throws ParseException{
		ApplicationContext context=SpringApplication.run(EmployeeApplication.class, args);
		employeeService=context.getBean(EmployeeService.class);
		departmentService = context.getBean(DepartmentService.class);
		skillService = context.getBean(SkillService.class);
		getEmployeeTest();
		addEmployeeTest();
		updateEmployeeTest();
		getDepartmentTest();
		addSkillTest();
		getAllPermanentEmployeesTest();
		getAverageSalaryTest();
		getAllEmployeesNativeTest();
		
	}
	
	private static void getEmployeeTest() {
		LOGGER.info("Start get Employee");
		Employee emp= employeeService.get(1);
		LOGGER.debug("Employee = {}",emp);
		LOGGER.debug("Department = {}",emp.getDepartment());
		LOGGER.debug("Skills = {}",emp.getSkillList());
		LOGGER.info("End get Employee");
		
	}
	
	private static void addEmployeeTest() throws ParseException {
		LOGGER.info("Start add employee");
		Employee emp=new Employee();
		emp.setName("Mary");
		emp.setSalary(24000);
		emp.setDateOfBirth(new SimpleDateFormat("yyyy-MM-dd").parse("1997-03-13"));
		emp.setDepartment(departmentService.get(1));
		emp.setPermanent(true);
		employeeService.save(emp);
		Employee empRetrieved=employeeService.get(2);
		LOGGER.debug("Added Employee = {}",empRetrieved);
		LOGGER.info("End add employee");
	}
	private static void updateEmployeeTest() {

		LOGGER.info("Start update employee");
		Employee emp = employeeService.get(1);
		Department department = departmentService.get(3);
		emp.setDepartment(department);
		employeeService.save(emp);
		Employee empSaved = employeeService.get(1);
		LOGGER.debug("Saved Employee = {}", empSaved);
		LOGGER.info("End update employee");

	}
	private static void getDepartmentTest() {

		LOGGER.info("Start get department");
		Department department = departmentService.get(2);
		Set<Employee> empList = department.getEmployeeList();
		LOGGER.debug("EmployeeList = {}", empList);
		LOGGER.info("End get department");

	}
	
	private static void addSkillTest() {
		LOGGER.info("Start add skill ");
		Employee emp = employeeService.get(3);
		Skill skill = skillService.get(2);
		Set<Skill> employeeSkill = emp.getSkillList();
		employeeSkill.add(skill);
		emp.setSkillList(employeeSkill);
		employeeService.save(emp);
		Employee newEmp = employeeService.get(3);
		LOGGER.debug("Modified Employee = {}", newEmp);
		LOGGER.debug("Skills = {}", newEmp.getSkillList());

		LOGGER.info("End add skill");
	}

	private static void getAllPermanentEmployeesTest() {

		LOGGER.info("Start get all permanent employees");
		List<Employee> employeeList = employeeService.getAllPermanentEmployee();
		LOGGER.debug("Permanent Employees = {}", employeeList);
		employeeList.forEach(e -> LOGGER.debug("Skills = {}", e.getSkillList()));
		LOGGER.info("End get all permanent employees");
		
		}
	
	private static void getAverageSalaryTest() {
		LOGGER.info("Start average salary");
		LOGGER.debug("Average Salary = {}", employeeService.getAvgSalary(1));		
		LOGGER.info("End average salary");

		}
	
	private static void getAllEmployeesNativeTest() {

		LOGGER.info("Start get employee native");
		List<Employee> employeeList = employeeService.getAllEmployeeNative();
		LOGGER.debug("Employees = {}", employeeList);
		LOGGER.info("End get employee native");

	}

}