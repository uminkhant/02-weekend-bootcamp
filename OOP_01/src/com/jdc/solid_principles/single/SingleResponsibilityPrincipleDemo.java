package com.jdc.solid_principles.single;

public class SingleResponsibilityPrincipleDemo {

	public static void main(String[] args) {
		Animal an = new Animal();
		an.setName("puppy");
		an.setType("dog");
		an.saveToDb();
		an.getFromDb();
	}
}
