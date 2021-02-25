package com.cognizant.ormlearn.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springframework.stereotype.Component;

@Component
public class Department {

	@NotNull
	@NumberFormat(style=Style.NUMBER)
	private int did;
	
	@NotNull
	@Size(min=1, max=30, message="Name should contain between 1 and 30 characters")
	private String dname;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + "]";
	}
	
	
}