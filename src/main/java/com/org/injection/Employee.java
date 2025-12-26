package com.org.injection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private int id;
	
	private String name;
	
	private int age;
	
	private List<Integer> numbers;
	
	private Map<Integer, String> map;
	
	private Set<String> addresses;

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
//		System.out.println("id,name,age set through constructor");
	}

	public Employee() {
		super();
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", numbers=" + numbers + "]";
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		
//		System.out.println("ID set through setter ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
//		System.out.println("name set through setter ");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
//		System.out.println("age set through setter ");
	}
	
	
	
	

}
