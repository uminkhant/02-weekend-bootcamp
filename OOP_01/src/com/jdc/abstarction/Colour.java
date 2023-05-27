package com.jdc.abstarction;

public abstract class Colour {

	 final String GREEN = "green";
	 final String RED = "red";
	 final String BLUEE = "blue";
	 
	 String color ;
	 
	  static {
		  
	  }
	  
	  {}
	 
	 Colour(){}
	 
	 public Colour(char c) {
		 switch(c) {
		 case'R':
			 color = RED;
			 break;
		 case'G':
			 color = GREEN;
			 break;
		 case'B':
			 color = BLUEE;
			 break;
		 }
	 }
	
	abstract void getColour();
	
	
	
}
