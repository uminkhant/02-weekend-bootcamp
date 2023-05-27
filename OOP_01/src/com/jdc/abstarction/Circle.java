package com.jdc.abstarction;

public class Circle extends Shape {

	Circle(double width, double heigth, char c) {
		super(width, heigth, c);
		
	}

	@Override
	void showArea() {
		System.out.println(width);
	}

	@Override
	void getColour() {
		System.out.println(color);
	}

}
