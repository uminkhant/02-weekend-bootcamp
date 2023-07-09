package com.jdc.mkt;

public interface MyInterTwo extends SuperInter{

	
	int sum(String str,int b);
	
	@Override
	default void doSome(String name) {
		SuperInter.super.doSome(name+" with MyInterTwo");
	}
	
	public static void doSomthing() {
		System.out.println("Do something");
	}
}
