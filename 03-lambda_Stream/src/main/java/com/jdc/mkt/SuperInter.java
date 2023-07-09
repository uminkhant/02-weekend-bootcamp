package com.jdc.mkt;

public interface SuperInter {

	default void doSome(String name) {
		System.out.println(name);		
	}
	
	static void work() {
		
	}
}
