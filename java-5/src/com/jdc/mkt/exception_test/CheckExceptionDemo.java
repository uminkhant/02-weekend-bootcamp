package com.jdc.mkt.exception_test;

import java.io.File;
import java.io.IOException;

public class CheckExceptionDemo {

	static Hello hello;
	
	public static void main(String[] args) {
		uncheckExceptionWithThrowsTest();
	}

	static void checkExceptionWithTryCatchTest() {
		
		try {
			File f = new File("tt.txt");
			f.createNewFile();

		} catch (IOException e) {
			System.out.println("dd");
		}
	}
	
	static void uncheckExceptionWithThrowsTest() throws NullPointerException {	
			hello.show();	
	}
}

class Hello{
	void show() {}
};
