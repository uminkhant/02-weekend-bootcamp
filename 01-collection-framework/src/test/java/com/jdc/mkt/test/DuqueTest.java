package com.jdc.mkt.test;


import java.util.ArrayDeque;
import java.util.Deque;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class DuqueTest {

	static Deque<String> deque;
	
	@BeforeAll
	static void init() {
		deque = new ArrayDeque<String>();
	}
	//@Test
	@Order(1)
	void insert() {
		deque.add("FF");
		deque.add("AA");
		deque.addFirst("BB");
		deque.addLast("CC");
		deque.offerLast("GG");
		deque.forEach(System.out::println);
	}
	@Test
	@Order(2)
	void select() {
		String str = deque.getLast();
		System.out.println("deque :"+str);
		//assertEquals("GG", str);
	}
}
