package com.org.annotations_with_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotations {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_annotations.xml");
		
		Bike bike = (Bike) context.getBean("bike");
		Bike bike2 = (Bike) context.getBean("bike");
		
		System.out.println(bike);
		System.out.println(bike2);
	}

}
