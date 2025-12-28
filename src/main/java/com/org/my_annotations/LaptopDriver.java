package com.org.my_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaptopDriver {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Laptop laptop = (Laptop) context.getBean("laptop");
		
		System.out.println(laptop.getId());
		System.out.println(laptop.getName());
		System.out.println(laptop.getColor());
		System.out.println(laptop.getPrice());
		
	}

}
