package com.jdc.mkt.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.jdc.mkt.MyInter;
import com.jdc.mkt.MyInterTwo;

@TestMethodOrder(OrderAnnotation.class)
public class LambdaTest {

	@Test
	@DisplayName("1.Before lambda")
	@Order(1)
	void test1() {
		MyInter m = new MyInter() {
			
			@Override
			public void show(String str,String nrc) {
				System.out.println("Hello Java Dev");
			}
		};
		m.show("AA","0232asd");
	}
	
	@Test
	@DisplayName("2.After lambda")
	@Order(2)
	void test2() {
		MyInter m = (str,nrc)-> System.out.println("Hello Java Dev");		
		m.show("AA","0232asd");
	}
	
	@Test
	@DisplayName("3.Lambda with return")
	@Order(3)
	void test3() {
		MyInterTwo two = ( x, y) -> {
			int i = Integer.parseInt(x);
			return i+y;
		};
		int result = two.sum("12",30);
		MyInterTwo.doSomthing();
		System.out.println(result);
	}
	
}













