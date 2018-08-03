package com.spring.rest.springRest.exception;

import java.util.Date;

public class ExceptionResponse {

	String message;
	Date time;
	String Details;
	
	public ExceptionResponse(String message, Date time, String details) {
		super();
		this.message = message;
		this.time = time;
		Details = details;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getDetails() {
		return Details;
	}
	public void setDetails(String details) {
		Details = details;
	}
	
}
