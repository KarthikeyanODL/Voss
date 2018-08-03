package com.learn.spring.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	private SortAlgorithm algorithm;
	
//	public BinarySearchImpl(SortAlgorithm algorithm) {
//		this.algorithm = algorithm;
//	}
	
	public int BinarySearch() {
		return algorithm.sort();
		
	}
}
