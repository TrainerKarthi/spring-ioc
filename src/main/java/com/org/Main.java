package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		Person person = new Person();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("karthik.xml");
		
		Person object1 = (Person)context.getBean("person");
		Person object2 = (Person)context.getBean("p");
		
		
		System.out.println(object1);
		System.out.println(object2);
		
//		Person person = context.getBean(Person.class);
//		System.out.println(person);
		
	}
}
