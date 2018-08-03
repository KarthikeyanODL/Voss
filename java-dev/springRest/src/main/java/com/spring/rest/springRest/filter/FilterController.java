package com.spring.rest.springRest.filter;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilterController {

	@GetMapping("/filtering")
	public Somebean getBean() {
		return new Somebean("UName","Password","Password");
	}
	
	@GetMapping("/dynamic/filternig")
	public MappingJacksonValue getBeans() {
		
		Somebean sb = new Somebean("UName","Password","address");
		SimpleBeanPropertyFilter sFilter = SimpleBeanPropertyFilter.filterOutAllExcept("Password","address");
		FilterProvider  filters = new SimpleFilterProvider().addFilter("SomebeanFilter", sFilter);
		MappingJacksonValue jacksonValue = new MappingJacksonValue(sb);
		jacksonValue.setFilters(filters);
		return jacksonValue;
	}
	
}
