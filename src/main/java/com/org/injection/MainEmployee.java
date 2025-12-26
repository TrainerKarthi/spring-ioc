package com.org.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmployee {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("injection.xml");
//		
//		Employee bean = (Employee) context.getBean("emp");
//		
//		System.out.println("Object through constructor"+bean);
//		
//		Employee bean2 = (Employee) context.getBean("emp2");
//		
//		System.out.println("Object through setter "+bean2);
		
//		Employee bean2 = (Employee) context.getBean("emp4");
////		
//		System.out.println(bean2.getAddresses());
		
		Employee bean2 = (Employee) context.getBean("emp5");
		
		System.out.println(bean2.getMap());
	}

}
