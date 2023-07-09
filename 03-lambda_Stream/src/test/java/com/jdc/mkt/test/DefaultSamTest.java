package com.jdc.mkt.test;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

public class DefaultSamTest {

	static void show(String s) {
		System.out.println(s);
	}
	
	//@Test
	void test1() {
		Consumer<String> c1 = a -> System.out.println(a);
		c1.accept("Hello");
		
		Consumer<String> c2 = DefaultSamTest::show;
		c2.accept("Hi");
		
		MyInter3<String> i3 = a -> System.out.println(a);
		i3.show("Hello");
	}
	//@Test
	void test2() {
		Function<String, Integer> f1 = a -> Integer.parseInt(a);
		System.out.println(f1.apply("45")+12);
	}
	
	//@Test
	void test3() {
		Supplier<String> s1 = ()-> "Hello Java Dev";
		System.out.println(s1.get());
	}
	
	@Test
	void test4() {
		BiPredicate<Integer, Integer> p1 = (x,y) -> x > y ;
		System.out.println(p1.test(5, 8));
	}
}




@FunctionalInterface
interface MyInter3<T>{	
	void show(T t);
	
	default void acept() {}
}












