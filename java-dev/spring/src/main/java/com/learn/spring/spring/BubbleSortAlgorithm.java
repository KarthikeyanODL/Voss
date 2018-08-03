package com.learn.spring.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm{

	@Override
	public int sort() {
		// TODO Auto-generated method stub
		return 0;
	}

}
