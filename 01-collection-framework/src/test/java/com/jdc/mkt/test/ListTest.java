package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.jdc.mkt.set.ListInterfaceDemo;

@TestMethodOrder(OrderAnnotation.class)
public class ListTest {

	static ListInterfaceDemo demo ;
	
	@BeforeAll
	static void init() {
		demo = new ListInterfaceDemo("array");
	}
	
	@Order(1)
	@ParameterizedTest
	@ValueSource(strings = {"Aung Aung","Maung Maung","Soe thu"})
	void insertList(String str) {
		demo.addList(str);
		
	}
	
	@Test
	@Order(2)
	void testList() {
		List<String> list = demo.getList();
		assertEquals(3, list.size());
		assertEquals("Aung Aung", list.get(0));
		list.add("Su Su");
		assertEquals(4, list.size());
		list.set(2, "Wanna");
		assertEquals("Wanna", list.get(2));
		assertEquals(3, list.indexOf("Su Su"));
		
		assertEquals(1, list.lastIndexOf("Maung Maung"));
		
		list.forEach(System.out::println);
	}
}










