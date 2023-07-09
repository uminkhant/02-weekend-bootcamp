package com.jdc.mkt;

@FunctionalInterface
public interface MyInter extends SuperInter{
	
	String name = "ss" ;

	void show(String str,String nrc);
	
	@Override
	default void doSome(String name) {
		SuperInter.super.doSome(name+" With MyInter");
	}
	
	
}
