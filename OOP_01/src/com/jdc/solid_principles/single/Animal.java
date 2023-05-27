package com.jdc.solid_principles.single;

public class Animal {

	//break single responsibility principle
	
	String name;
	String type;
	
	// from view
	void setName(String name) {
		this.name = name;
	}
	
	void setType(String type) {
		this.type = type;
	}
	
	//database
	void saveToDb() {
		System.out.println("Saving to db with:"+name);
	}
	
	void getFromDb() {
		System.out.println("Reference data from db");
	}
	
	
}
