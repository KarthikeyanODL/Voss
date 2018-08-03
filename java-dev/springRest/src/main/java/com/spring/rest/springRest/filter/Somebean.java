package com.spring.rest.springRest.filter;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFilter("SomebeanFilter")
public class Somebean {
	private String Uname;
	//@JsonIgnore
	private String password;
	private String address;
	
	public Somebean(String uname, String password, String address) {
		super();
		Uname = uname;
		this.password = password;
		this.address = address;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
