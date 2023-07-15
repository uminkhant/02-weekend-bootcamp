package com.jdc.mkt;

public class Demo {

	public Demo() {
		super();
	}
	
	
	
	public Demo(String name, String nrc) {
		
		System.out.println("Constructor :"+name+"\t"+nrc);
	}

	public void instanceMethod(String str,String nrc) {
		System.out.println("instance method :"+str+"\t"+nrc);
	}
	
	public static void staticMethod(String str,String nrc) {
		System.out.println("static method :"+str+"\t"+nrc );
	}
	
}
