package com.jdc.mkt.composition;

public class Bathroom {

	private Shower shower;
	private Shampoo shampoo;
	
	Bathroom(Shower shower,Shampoo shampoo){
		this.shower = shower;
		this.shampoo = shampoo;
	}
	
	void takeShower() {
		shower.takeShower();
		shampoo.useShampoo();
	}
	
	class Shampoo{
		void useShampoo() {}
	}
}
