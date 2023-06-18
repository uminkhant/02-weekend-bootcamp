package com.jdc.mkt.test;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Queue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.jdc.mkt.set.QueueDemo;

@TestMethodOrder(OrderAnnotation.class)
public class QueueTest {

	static QueueDemo demo;
	
	@BeforeAll
	static void init() {
		demo = new QueueDemo("block");
	}
	
	@Test
	@Order(1)
	void insert() {
		demo.addQueue("John","Willam","Smith");
		Queue<String> que = demo.getQueue();
		
		assertEquals(3, que.size());
		que.offer("Sam");
		que.offer("Samlew");
		assertEquals(4, que.size());
		assertFalse(que.contains("Samlew"));
		
	}
	
	@Test
	@Order(2)
	void remove() {
		Queue<String> que = demo.getQueue();
		que.remove();
		que.remove("Smith");
		que.poll();
		que.forEach(System.out::println);
	}
	@Test
	@Order(3)
	void select() {
		Queue<String> que = demo.getQueue();
		String str = que.peek();
		assertNotNull(str);
	}
}
