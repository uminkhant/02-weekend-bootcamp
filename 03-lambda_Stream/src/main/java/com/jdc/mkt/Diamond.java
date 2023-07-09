package com.jdc.mkt;

public class Diamond implements MyInter,MyInterTwo{

	@Override
	public void show(String str, String nrc) {
		
	}
	
	@Override
	public int sum(String str, int b) {
		return 0;
	}

	@Override
	public void doSome(String name) {
		MyInterTwo.super.doSome(name);
	}

}
