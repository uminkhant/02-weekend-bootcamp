package com.jdc.mkt.stream.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class OptionalTest {

	// @Test
	void test1() {

		ArrayList<String> list = new ArrayList<String>();
		String name = "Zin Ko";

		list.add("Andrew");
		list.add("William");
		list.add("Susan");
		list.add(name);
		list.add("Zaw Zaw");
		// list.stream().findFirst().ifPresent(System.out::println);
		String ss = list.stream().parallel().filter(n -> n.startsWith("Z")).findAny().filter(a -> a.equals(name)).get();
		System.out.println(ss);
	}

	//@Test
	void test2() {
		List<String> list = List.of("ss", "rr", "aa");
		List l1 = list.stream().map(e -> e + "an").collect(Collectors.toList());
		System.out.println(l1);
	}

	//@Test
	void test3() {
		int i = List.of(2, 3, 4, 5, 6).stream().reduce(Integer::sum).get();
		System.out.println(i);
	}

	@Test
	void test4() {
		
		List<Integer>list =  new ArrayList<Integer>(List.of(7,6,2,3,4,5));
		list.stream()
		 .sorted() 
		 .dropWhile(a -> a < 5)
		 .mapToInt(i -> Integer.valueOf(i))
		 .forEach(System.out::println);
		
	}

//	static Optional<String> getValue(String str){
//		return new Optional<String>(str);
//	}
}
