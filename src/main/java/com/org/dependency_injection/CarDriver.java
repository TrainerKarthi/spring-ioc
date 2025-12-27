package com.org.dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("dependency_injection.xml");
		
		Car car = context.getBean(Car.class);
		
		System.out.println(car.getEngine());
		
	}
}
