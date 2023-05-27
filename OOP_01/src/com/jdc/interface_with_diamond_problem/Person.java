package com.jdc.interface_with_diamond_problem;

public class Person implements Painting,Draw {

	@Override
	public void doWork() {
		
	}

	@Override
	public void problem() {
		Draw.super.problem();
	}

}
