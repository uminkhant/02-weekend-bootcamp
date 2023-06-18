package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.mkt.set.MapDemo;
import com.jdc.mkt.set.Person;

@TestMethodOrder(OrderAnnotation.class)
public class MapTest {

	static MapDemo demo;
	@BeforeAll
	static void init() {
		demo = new MapDemo("tree");
	}
	
	@Order(1)
	@ParameterizedTest
	@CsvSource(value ={"1,samlew,12","2,arnel,23","3,upul,30","4,upul,12"} )
	void createMap(int key,String name,int age) {
		Person p = new Person(name,age);
		demo.addMap(key, p);
		
	}
	@Test
	@Order(2)
	void testOne() {
		Map<Integer, Person> map = demo.getMap();
		assertEquals(4, map.size());
		assertTrue(map.containsKey(2));
		
	}
	
	
}
