package com.jdc.interface_with_diamond_problem;

public interface Draw extends Work {

	@Override
	default void problem() {
		System.out.println("From draw");
	}
}
