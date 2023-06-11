package com.jdc.mkt.exception_test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

public class TryCatchDemo {

	static String arr[] = new String[0];
	public static void main(String[] args) {
		tryCatchFinally();
	}
	static void tryMultiCatch(int i) {
		try {
			System.out.println(2/i);				
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Arithmetic exception");
		}catch (RuntimeException e) {
			System.out.println("Runtime exception");
		}catch(Exception e){
			System.out.println("Exception");
		}
	}
	
	static void tryMultiCatchTwo(int i) {
		try {
			//arr[1] = "Hello";
			System.out.println(2/i);
			File f = new File("test.txt");
			f.createNewFile();
			
		}catch (ArrayIndexOutOfBoundsException | IOException e) {
			System.out.println("Arithmetic exception");
		}
	}
	
	static void tryCatchFinally() {
		class Hello{
			void show() {}
		}	
		try{
			Hello h = null;
			h.show();
		}catch (Exception e) {
			System.out.println("Null Pointer exception");
		}finally {
		 System.out.println("finally do something");
		}		
		
	}
	static void tryWithResource() {
		try(Connection con = DriverManager.getConnection(""); Human h = new Human()){
			
			h.doSomething();
			
		}catch (Exception e) {
			System.out.println("exception");
		}
	}
}

class Human implements AutoCloseable{

	void doSomething() {}
	@Override
	public void close() throws Exception {
		System.out.println("close");
		
	}}
