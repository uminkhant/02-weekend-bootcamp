package com.jdc.mkt.set;

public class Person {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		
	}
//	@Override
//	public int compareTo(Person p) {
//		return name.compareTo(p.getName());
//		
//	}
//	@Override
//	public int compareTo(Person p) {
//		
//		if(age > p.getAge()) {
//			return 1;
//		}
//		return -1;
//	}
	
	
}


