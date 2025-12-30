package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		Person person = new Person();
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("karthik.xml");
		
		context.registerShutdownHook();
		
//		understanding life cycle
		Building building = context.getBean(Building.class);
		System.out.println(building);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Person object1 = (Person)context.getBean("person");
//		Person object2 = (Person)context.getBean("p");
//		
//		
//		System.out.println(object1);
//		System.out.println(object2);
		
//		Person person = context.getBean(Person.class);
//		System.out.println(person);
		
	}
}