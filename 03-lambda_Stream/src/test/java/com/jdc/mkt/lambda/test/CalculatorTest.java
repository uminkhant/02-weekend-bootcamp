package com.jdc.mkt.lambda.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.BiFunction;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	BiFunction<Integer, Integer, Integer> fun;

	@Test
	void calculateTest() {

		int result = useOpearter(5, 6, "*");
		assertEquals(30, result);
	}

	int useOpearter(int x, int y, String ope) {
		switch (ope) {
		case "+":
			fun = (a, b) -> a + b;
		case "-":
			fun = (a, b) -> a - b;
			break;
		case "*":
			fun = (a, b) -> a * b;
			break;
		case "/":
			fun = (a, b) -> a / b;
			break;
		}
		return fun.apply(x, y);

	}
}
