package com.jdc.abstarction;

public class Main {

	public static void main(String[] args) {
		
		//By Instance
		Shape s = new Circle(3.0,25.2,'B');
		s.showArea();
		s.getColour();
		
		//By Anonymous
		Shape s1 = new Shape(4.5,23) {
			
			@Override
			void showArea() {
				System.out.println(heigth/2);
			}

			@Override
			void getColour() {
				System.out.println(RED + BLUEE + GREEN);
			}
		};		
		s1.showArea();
		s1.getColour();
		
	}
}
