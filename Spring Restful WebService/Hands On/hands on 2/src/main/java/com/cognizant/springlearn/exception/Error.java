package com.cognizant.springlearn.exception;
public class Error {
	
	private String code;
	private  String msg;
	
	public Error(String code, String message) {
		
		this.code = code;
		this.msg = message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return msg;
	}
	
}
