package com.jdc.mkt.interface_test;

public interface Human  {
	
	String name_int = "";
	public String ss_int = "";
	
		 void doSomething();
	 
	 //public ,default can't create
	 // private ,default  can create
	//  private void show() {}
	 
	 default void hide() {}
	 static void doSome() {}
	 
	 
	 
}
