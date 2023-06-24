package com.jdc.mkt.test;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@TestMethodOrder(OrderAnnotation.class)
public class StringBufferBuilderTest {

	@Test
	@Order(1)
	void testStringBuilder() {
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" Java");
		sb.append(" Developer");
		System.out.println(sb.toString());
		sb.delete(5, 10);
		System.out.println(sb.toString());
		sb.insert(5, " Spring");
		System.out.println(sb.toString());
		sb.replace(5, 12," Angular" );
		System.out.println(sb.toString());
	}
	
	@ParameterizedTest
	@Order(2)
	@CsvSource(value = {"Aung Aung,23","Maung Maung,43"})
	void testFormat(String name ,int age) {
		
		String mess = "Hello %s,your age is %d".formatted(name,age);
		System.out.println(mess);
		
		String n = String.format("Hello %s", name);
		System.out.println(n);
		
		System.out.printf("name :%s \t age :%d",name,age);
		
	
	}
	
	
	
	
	
}
