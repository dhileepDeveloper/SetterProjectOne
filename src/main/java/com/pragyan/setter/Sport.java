package com.pragyan.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sport {

	@Autowired
	private Cricket cricket;
		
	public void print()
	{
		System.out.println(cricket.getScore());
	}
} 
