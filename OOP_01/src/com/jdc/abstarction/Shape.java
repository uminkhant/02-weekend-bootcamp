package com.jdc.abstarction;

public  abstract class Shape extends Colour {

	  double width;
	  double heigth;
	  static String name;
	  
	  
	 
	
	Shape(double width,double height){
		this.width = width;
		this.heigth = height;
	}
	
	Shape(double width,double heigth,char c){
				super(c);
				this.width = width;
				this.heigth = heigth;
	}
	
	 abstract void showArea();
	
	static void doSomething() {}
	
}
