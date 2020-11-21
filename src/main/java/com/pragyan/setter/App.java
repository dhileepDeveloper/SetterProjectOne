package com.pragyan.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/pragyan/setter/beans/beans.xml"); 
		Sport sport = context.getBean(Sport.class);
		sport.print();
	
	}

}
