package com.jdc.mkt.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.jdc.mkt.MyInter;
@TestMethodOrder(OrderAnnotation.class)
public class EffectvieFinalTest {

	@Test
	@Order(1)
	@DisplayName("1.Test Effectively Final")
	void test1() {
		String message = "Hello Java";	
		MyInter one = (a,b) -> System.out.println(message);
		one.doSome(message);
		one.show("hell", message);
	}
	@Test
	@Order(2)
	@DisplayName("2.Test Method References")
	void testReference() {
		
	}
}
