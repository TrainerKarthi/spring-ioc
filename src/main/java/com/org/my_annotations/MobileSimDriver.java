package com.org.my_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MobileSimDriver {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Mobile bean = (Mobile) context.getBean("mobile");
	
		System.out.println(bean);
		System.out.println(bean.getSim());
		
		System.out.println(context.getBean("sim"));
	}
}
