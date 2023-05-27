package com.jdc.mkt.interface_test;

public class Main {

	public static void main(String[] args) {
		
		Human h = new Student();
		h.doSomething();
		
		@SuppressWarnings("unused")
		Human h1 = new Human() {
			
			@Override
			public void doSomething() {
				
			}
		};
		
	}
}
