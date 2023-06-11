package com.jdc.mkt.exception_test;

public class MyCustomException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public MyCustomException(String message) {
		super(message);		
	}

	
}
