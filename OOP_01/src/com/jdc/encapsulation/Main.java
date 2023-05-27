package com.jdc.encapsulation;

import com.jdc.abstarction.Shape;
import com.jdc.abstarction.Square;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setName("Aung Aung");
		p.setMale(true);
		p.setAge(12);
		System.out.println("Name : "+p.getName());
		System.out.println("Age : "+p.getAge());
	
		
	
	}
}
