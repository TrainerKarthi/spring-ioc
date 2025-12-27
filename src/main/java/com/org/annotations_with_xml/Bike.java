package com.org.annotations_with_xml;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bike {

	public Bike() {
		super();
		System.out.println("Bike created");
	}

	
}
