package com.jdc.abstarction;

public class Rectangle extends Shape{

	Rectangle(double width, double height) {
		super(width, height);
		
	}

	@Override
	void showArea() {
		System.out.println(width*heigth);
		
	}

	@Override
	void getColour() {
		System.out.println(GREEN);
	}

	

}
