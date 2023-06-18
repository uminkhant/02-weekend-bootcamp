package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.jdc.mkt.set.Person;
import com.jdc.mkt.set.SetInterfaceDemo;

@TestMethodOrder(OrderAnnotation.class)
public class SetTest {

	private static SetInterfaceDemo demo;
	
	@BeforeAll
	static void create() {
		demo = new SetInterfaceDemo("hash");
	}
	
	@Test
	@Order(1)
	void testAdd() {
		demo.addSet(new Person("Aung Aung",23),
				new Person("Thida",13),
				new Person("Wanna",30));
		assertEquals(3, demo.getSet().size());
		
	}
	@Test
	@Order(2)
	void testGet() {
		var set = demo.getSet();
		assertFalse(set.isEmpty());
		
		var itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getName());
		}
		
	}
	
	
}
