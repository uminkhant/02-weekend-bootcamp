package com.jdc.mkt.exception_test;


public class ThrowExceptionDemo {

	public static void main(String[] args) {
		setName("aswerqertwer sdfsd",-1);
	}
	
	static void setName(String name, int age) {
		try {
			createException(name,age);
		
		}catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void createException(String name,int age)  {
		
		if(name.length()> 15) {
			throw new RuntimeException("Too long characters !");
		}
		
		if(age < 0) {
			throw new MyCustomException("My Custom exception");
		}
		
	}
}
