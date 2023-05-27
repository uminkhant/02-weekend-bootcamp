package com.jdc.mkt.interface_test;

public class Student implements Human,Registor {

	public String name;
	
	public void showSomething() {
		System.out.println("Showing ...");
	}
	
	
	
	@Override
	public void doSomething() {
		System.out.println("Do Something");
	}



	@Override
	public void registor() {
		// TODO Auto-generated method stub
		
	}

}
