package com.spring.rest.springRest;

import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Book {
	
	int id;
	@Size(min=4,message="Name should have atleast 4 character")
	@ApiModelProperty(notes= "Name should have atleast 4 character" )
	String name;
	
	String author;
	
	protected Book() {}
	
	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	

}
