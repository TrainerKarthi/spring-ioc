package com.org.annotations_with_xml;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Human {

	public Human() {
		super();
		System.out.println("Human Created");
	}
	
}