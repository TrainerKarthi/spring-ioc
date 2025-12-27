package com.org.dependency_injection;

public class Car {

	
	private Engine engine;
	
	public Car() {
		super();
		System.out.println("Car Object created");
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
