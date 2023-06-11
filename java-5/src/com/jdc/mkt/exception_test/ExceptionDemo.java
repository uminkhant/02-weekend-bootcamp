package com.jdc.mkt.exception_test;

public class ExceptionDemo {

	public static void main(String[] args) {
		methodOne();
	}
	
	static void methodOne() {
		methodTwo();
	}

	private static void methodTwo(){
		methodThree();
	}

	private static void methodThree() {
		try {
			System.out.println(2/0);
			
		}catch (RuntimeException e) {
			System.out.println("can't divided by zero !");
		}
		
	}
}
