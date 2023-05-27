package com.jdc.interface_with_diamond_problem;

public interface Painting extends Work {

	@Override
	default void problem() {
		System.out.println("From painting");
	}

}
