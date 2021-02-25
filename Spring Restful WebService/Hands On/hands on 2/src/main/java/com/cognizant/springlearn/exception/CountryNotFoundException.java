package com.cognizant.springlearn.exception;

public class CountryNotFoundException extends RuntimeException {

	private String id;

	public CountryNotFoundException(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}
	
}