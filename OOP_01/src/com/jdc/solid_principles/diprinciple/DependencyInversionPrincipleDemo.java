package com.jdc.solid_principles.diprinciple;

public class DependencyInversionPrincipleDemo {

	public static void main(String[] args) {
//		Animal an = new Lion();
//		an.roar();
		
		Computer c = new Computer(new WirelessKeyBoard());
		c.useKeyBoard();
	}
}

interface KeyBoard{
	void getKeyBord();
}
class WirelessKeyBoard implements KeyBoard{

	@Override
	public void getKeyBord() {
		System.out.println("Use wireless keyboard");
	}
	
}

class SimpleKeyBoard implements KeyBoard{
	public void getKeyBord() {
		System.out.println("Use simple keyboard");
	}
}

class Computer{
	private KeyBoard keyboard;
	
	Computer(KeyBoard keyboard){
		this.keyboard  = keyboard;
	}
	
	void useKeyBoard() {
		keyboard.getKeyBord();
	}
}


//abstract class  Animal{
//	
//	abstract void roar();
//}
//
//class Lion extends Animal{
//	
//	@Override
//	void roar() {
//		//details
//		System.out.println("ss");
//	}
//}
