package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.function.Executable;

@TestMethodOrder(OrderAnnotation.class)
public class CollectionTest {

	static  ArrayList<String> list = new ArrayList<String>();
	
	@BeforeAll
	static void init() {
		list.add("Marry");
		list.add("Snow");
		list.add("William");
		list.add("Andrew");
		list.add("Snow");
		
	 }
	
	
	
	@Test
	@Order(1)
	@DisplayName("Shuffling")
	void testShuffle() {
		System.out.println("Before shuffle");
		System.out.println(list);
		System.out.println("After shuffle");
		Collections.shuffle(list);
		System.out.println(list);
	}
	@Test
	@Order(2)
	@DisplayName("Sorting")
	void testSort() {
		System.out.println("Before Sort");
		System.out.println(list);
		System.out.println("After sort");
		Collections.sort(list);
		System.out.println(list);
	}
	@Test
	@Order(3)
	@DisplayName("Binary Search")
	void testSearch() {
		System.out.println(list);
		assertEquals(2, Collections.binarySearch(list, "Snow"));
	}
	
	@Test
	@Order(4)
	@DisplayName("Frequency")
	void testFrequency() {
		int i = Collections.frequency(list, "Snow");
		assertEquals(2, i);
	}
	
	@Test
	@Order(5)
	@DisplayName("Disjoint")
	void testDisjoint() {
		ArrayList<String> str = new ArrayList<String>();
		str.add("Arnel");
		str.add("Upul");
		var res = Collections.disjoint(list, str);
		assertTrue(res);
		str.add("William");
		var res1 = Collections.disjoint(list, str);
		assertFalse(res1);
	}
	@Test
	@Order(6)
	@DisplayName("Unmodified")
	void testUnmodified() {
		List<String> str2 = Collections.unmodifiableList(list);
		
		assertThrows(UnsupportedOperationException.class,new Executable() {

			@Override
			public void execute() throws Throwable {
				str2.add("fazzar");
				
			}});
	}
	
	
	@Test
	@Order(7)
	@DisplayName("Synchronized")
	void testSnychronized() {
		List<String>str3 = Collections.synchronizedList(list);
		str3.add("new dd");
		System.out.println(str3);
	}
	
	
	
}
