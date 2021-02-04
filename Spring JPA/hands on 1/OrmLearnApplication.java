package com.cognizant.ormlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

import java.util.List;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;


@SpringBootApplication
public class OrmLearnApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static CountryService countryService;

	public static void main(String[] args) throws CountryNotFoundException {
		
		LOGGER.info("Inside main");
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

		countryService = context.getBean(CountryService.class);
		testGetAllCountries();
		getAllCountriesTest();
		testAddCountry();
		testUpdateCountry();
		testDeleteCountry();
		testFindCountryByPartialName();
		 testFindCountryByname();
		 testFindCountryByStartingName();
		
	}
	private static void testGetAllCountries() {

		LOGGER.info("Start");
		List<Country> countries = countryService.getAllCountries();
		LOGGER.debug("countries={}", countries);
		LOGGER.info("End");

		}
	private static void getAllCountriesTest() throws CountryNotFoundException {

		LOGGER.info("Start getAllCountryByCode");
		Country country = countryService.findCountryByCode("IN");
		LOGGER.debug("Country:{}", country);
		LOGGER.info("End");

		}
	private static void testAddCountry() throws CountryNotFoundException{
		LOGGER.info("Start AddCountry");
		Country sample= new Country();
		sample.setCode("SC");
		sample.setName("SampleCountry");
		countryService.addCountry(sample);
		Country newSample=countryService.findCountryByCode("SC");
		LOGGER.debug("Country:{}", newSample);
		LOGGER.info("End");
		
	}
	 
	private static void testUpdateCountry() throws CountryNotFoundException {
		LOGGER.info("Start UpdateCountry");
		countryService.updateCountry("SC", "SampleModified");
		LOGGER.info("End");
	}
	
	private static void testDeleteCountry() throws CountryNotFoundException {
		LOGGER.info("Start DeleteCountry");
		countryService.deleteCountry("SC");
		LOGGER.info("End");
	}
	private static void testFindCountryByPartialName()throws CountryNotFoundException{
		LOGGER.info("Start find CountryByPartialName");
		List<Country>countryList=countryService.findCountryByPartialName("Sou");
		LOGGER.debug("Country:{}", countryList);
		LOGGER.info("End");
	}
	
	private static void testFindCountryByname()throws CountryNotFoundException{
		LOGGER.info("Start find CountryByName");
		List<Country>countryList=countryService.findCountryByname("ou");
		LOGGER.debug("Country:{}", countryList);
		LOGGER.info("End");
	}
	private static void testFindCountryByStartingName()throws CountryNotFoundException{
		LOGGER.info("Start find CountryByStartingName");
		List<Country>countryList=countryService.findCountryByStartingName("Sou");
		LOGGER.debug("Country:{}", countryList);
		LOGGER.info("End");
	}
	

}
