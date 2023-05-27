package com.jdc.solid_principles.liskov;

public class LiskovDemo {

	public static void main(String[] args) {
		Engine engine = new Bike();
		engine.useDisel();
		engine.useOctine();
	}
}

class Car extends Engine {

	
}
class Bike extends Engine{

	}
class Engine{
	void useOctine() {
		System.out.println("Use octine");
	};
	void useDisel() {
		System.out.println("use disel");
	};
}


