package com.cognizant.springlearn;

import java.text.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.model.Country;

@SpringBootApplication
public class SpringLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		Display();
		DisplayCountry();
		DisplayCountrylist();
	
		
	}
	public static void DisplayCountry() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		Country country = (Country) context.getBean("in", Country.class);
		LOGGER.info("Start Display Country");

		LOGGER.debug("Country : {}", country.toString());
		LOGGER.info("End Display Country");
		
	}
	public static void DisplayCountrylist() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		List<Country> countrylist = new ArrayList<>();
			countrylist=(List<Country>)context.getBean("countryList", ArrayList.class);
		LOGGER.info("Start Display Country");

		LOGGER.debug("Countrylist : {}", countrylist);
		LOGGER.info("End Display Country");
		
	}
	public static void Display() {
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		LOGGER.info("Start");
		try {
			Date date=format.parse("31/12/2018");
			LOGGER.debug(format.format(date));
			LOGGER.info("End");
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}

}