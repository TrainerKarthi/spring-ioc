package com.org.scenarios;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IceCreamParlour {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CongurationClass.class);
		
//		System.out.println(context.getBean(Ramana.class).getIceCream());
		
		IceCream iceCream = context.getBean(Ramana.class).getIceCream();

		iceCream.flavour();
		
		context.getBean(Lavan.class).getCream().flavour();
	}

}
