package com.cognizant.springlearn.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.cognizant.springlearn.exception.CountryNotFoundException;
import com.cognizant.springlearn.exception.Error;
import com.cognizant.springlearn.model.Country;

@RestController
public class CountryController {

	ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
	

@GetMapping("/hello")
	public String sayHello() {
		
		return "Hello World!!";
		
	}
@RequestMapping("/country")
public Country getCountry() {
	

	Country country = (Country) context.getBean("in", Country.class);
	
	return country;
}
@GetMapping("/countries")
public List<Country> getAllCountries() {
	

	List<Country> countrylist = new ArrayList<>();
		countrylist=(List<Country>)context.getBean("countryList", ArrayList.class);
		
	return countrylist;
}
@GetMapping("/country/{id}")
public Country getCountrybyId(@PathVariable String id)throws CountryNotFoundException {

	
	ArrayList<Country> countrylist=context.getBean("countryList", ArrayList.class);
	Country country=new Country();
	Iterator<Country> itr = countrylist.iterator();
	while(itr.hasNext()) {
		
		 country = (Country)itr.next();
		
		if(country.getCode().equals(id)) {
			
			break;
		}
	
		country = null;
	
	}
	
	if (country == null) {
		
		throw new CountryNotFoundException(id);
	}
	return country;
	

}
@ExceptionHandler(CountryNotFoundException.class)
@ResponseStatus(code=HttpStatus.NOT_FOUND, reason="Country Not Found") 
public Error employeeNotFound(CountryNotFoundException e) {
	
	String id = e.getId();
	
	
	return new Error(id,"Country Not Found");
	
	
}

}