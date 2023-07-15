package com.jdc.mkt.test;

import java.io.Serializable;

public class SerializableTest {
	
	Human h = new Human();
	
	void test1() {
		
		h.setId(1);
		h.setName("Hello");
	}
	
}

class Human implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
