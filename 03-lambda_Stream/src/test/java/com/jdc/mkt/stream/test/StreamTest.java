package com.jdc.mkt.stream.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class StreamTest {

	@Test
	@DisplayName("1.Before and after streams")
	@Disabled
	@Order(1)
	void test1() {
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int result = sum(list);
		System.out.println(result);
	}

	@Test
	@DisplayName("2.From Arrays and Collection to stream")
	@Disabled
	@Order(2)
	void test2() {
		int[] arr = { 4, 5, 6 };
		Arrays.stream(arr).forEach(System.out::print);

		Collection<Integer> col = List.of(2, 3, 4, 5);
		col.stream().forEach(System.out::print);
		System.out.println();
	}

	@Test
	@DisplayName("3.From IntStream with range")
	@Disabled
	@Order(3)
	void test3() {
		int i = IntStream.range(1, 10).sum();
		System.out.println(i);
		long l = LongStream.rangeClosed(1, 10).sum();
		System.out.println(l);
	}

	@Test
	@DisplayName("4.From genereate and iterate")
	@Disabled
	@Order(4)
	void test4() {
		
		int i = (int) Math.floor(Math.random()*10);
		System.out.println(i);
		DoubleStream.generate(Math::random).limit(6).forEach(System.out::println);
		IntStream.iterate(0, a -> a + 2).limit(5).forEach(System.out::println);
		Stream.iterate("a", x -> x + "a").limit(5).forEach(System.out::println);
	
	}
	
	
	
	
	@Test
	@DisplayName("5.Intermediate operation")
	@Disabled
	@Order(5)
	void test5() {
		List<String> list = List.of("2", "4", "3", "9", "8", "12", "4", "1", "6", "8");
		list.stream().distinct().mapToInt(s -> Integer.parseInt(s) + 2).filter(i -> i % 2 == 0).sorted()
				.forEach(System.out::println);

		List<?> li = Stream.of(List.of(1, 2), List.of(3, 4), List.of(5, 6)).flatMap(l -> l.stream()).toList();
		System.out.println(li);

	}

	@Test
	@DisplayName("6.Terminal operation")
	@Order(6)
	void test6() {
		// iterate
		List<Integer> list =new ArrayList<Integer>();
		list.add(5);
		list.add(3);
		list.add(6);
		list.add(1);
		list.stream().forEachOrdered(System.out::println);
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person());
		persons.stream().forEachOrdered(System.out::println);
		
		// checking
		boolean b = IntStream.rangeClosed(1, 10).noneMatch(a -> a == 11);
		System.out.println(b);
		
		//result
		int i = List.of(2,7,4,5,11).stream().filter(a -> a%3 == 0).findFirst().orElse(9);
		System.out.println(i);
		
		
		
	}
	
	class Person{}

	private int sum(List<Integer> list) {
		return list.stream().mapToInt(a -> Integer.valueOf(a)).sum();
//		int i = 0;
//		for(int x:list) {
//			i += x;
//		}
//		return i;

	}

}
