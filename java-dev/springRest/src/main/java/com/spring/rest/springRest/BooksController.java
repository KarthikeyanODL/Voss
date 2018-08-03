package com.spring.rest.springRest;

import java.util.List;

import javax.validation.Valid;

import java.net.URI;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class BooksController {
	
	List<Book> lbooks = new ArrayList<Book>();
	{
		Book b1 = new Book(1, "Java1", "Ranga");
		Book b2 = new Book(1, "Java2", "Ranga");
		Book b3 = new Book(1, "Java3", "Ranga");
		Book b4 = new Book(1, "Java4", "Ranga");
		
		//List<Book> lbooks = new ArrayList<Book>();
		lbooks.add(b1);
		lbooks.add(b2);
		lbooks.add(b3);
		lbooks.add(b4);
	}
	
	@GetMapping("/books")
	public List<Book> getBooks() {			
				
		return lbooks;
	}
	
	@GetMapping("/books/{name}")
	public Book getBook(@PathVariable String name) {
		
		for(Book b : lbooks) {
			if(b.getName().equals(name)) {
				return b;
			}
		}
		throw new BookNotFoundException("name "+name);		
		
	}
	
	@PostMapping("/books")
	public ResponseEntity<Object> createUser(@Valid @RequestBody Book book) {
		
		lbooks.add(book);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
		.path("{id}")
		.buildAndExpand(book.getId())
		.toUri();
		return ResponseEntity.created(location).build();
	}
	

}
