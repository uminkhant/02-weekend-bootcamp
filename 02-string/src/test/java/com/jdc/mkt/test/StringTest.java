package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class StringTest {

	String message = "Hello Java";
	@Test
	@Order(1)
	void testSearch() {
		int res = message.lastIndexOf("va");
		System.out.println(res);
		int res1 = message.lastIndexOf("va",9);
		System.out.println(res1);
		
		
	}
	@Test
	@Order(2)
	void testCheck() {
		assertTrue(message.endsWith("va"));
		assertTrue(message.contains("va"));
		assertTrue(message.equalsIgnoreCase("hello java"));
		assertFalse(message.equals("hello java"));
		
		int res =  message.compareTo("hello java");
		assertTrue(res < 0);
		int res1 = "hello java".compareTo(message);
		assertTrue(res1 > 0);
		int res3 = "hello java".compareToIgnoreCase(message);
		assertTrue(res3 == 0);
	}
	
	@Test
	@Order(3)
	void testSubString() {
		String s1 = message.substring(6);
		assertEquals("Java", s1);
		String s2 = message.replaceAll("Java", "Spring");
		System.out.println(s2);
		assertEquals("Spring", s2.substring(6));
		
	}
	
	@Test
	@Order(4)
	void testOther() {	
		String[] array = message.split(" ");
		assertEquals(2, array.length);
		
		String s1 = " Hello Java  ";
		System.out.println(s1.length());
		String s2 = s1.trim();
		System.out.println(s2.length());
		
	}
	@Test
	@Order(5)
	void testConcat() {
		String s1 = "Hello "+20+30.0;
		String s2 = s1.concat("K");
		System.out.println(s2);
	}
	
}
