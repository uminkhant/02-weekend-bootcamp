package com.jdc.encapsulation;

import com.jdc.mkt.interface_test.Human;

public class Person implements Human{

	private String name;
	private int age;
	private boolean isMale;

	void setName(String name) {
		this.name = name;
	}

	void setAge(int age) {
		this.age = age;
	}
	
	private String modifiedName() {	
		return isMale == true?"Mr."+name:"Mrs."+name;
	}

	String getName() {
		return modifiedName();
	}

	int getAge() {
		return age > 0 ? age : 1;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	@Override
	public void doSomething() {
		@SuppressWarnings("unused")
		String s = Human.ss_int;
		System.out.println(name_int); ;
	}
	
	
	
	
	
	
}
