package com.jdc.abstarction;


public class Square extends Shape {

	public Square(double width, double height) {
		super(width, height);
	}

	@Override
	public void showArea() {
		System.out.println(width*width);
	}

	@Override
	void getColour() {
		System.out.println(RED);
		
	}
	
}
