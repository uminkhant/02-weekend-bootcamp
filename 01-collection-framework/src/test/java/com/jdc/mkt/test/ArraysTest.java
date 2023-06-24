package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class ArraysTest {

	String []array = {"William","Susan","Andrew","Snow"};
	
	@Test
	@DisplayName("Sorting")
	@Order(1)
	void testSort() {
	
		System.out.println("Before Sort");
		showArray(array);
		System.out.println("After Sort");
		Arrays.sort(array,0,2);
		showArray(array);
		
	}
	
	@Test
	@DisplayName("Binary Search")
	@Order(2)
	//must be order first
	void testBinarySearch() {
		System.out.println("Binary Search");
		
		Arrays.sort(array);
		showArray(array);
		assertEquals(1, Arrays.binarySearch(array, 0,2,"Snow"));
		assertEquals(3, Arrays.binarySearch(array, "William"));
	}
	
	@Test
	@DisplayName("Fill element")
	@Order(3)
	void testFill() {
		Arrays.fill(array,0,1, "No Element");
		showArray(array);
	}
	
	@Test
	@DisplayName("Copy of")
	@Order(4)
	void testCopyOf() {
		String[] str1 = Arrays.copyOf(array, 3);
		showArray(str1);
		
		//fixed array to unlimitted array
		array = Arrays.copyOf(array, array.length+1);
		showArray(array);
	}
	
	void showArray(String[] arr) {
		System.out.print("[");
		for(int i = 0; i< arr.length;) {
			System.out.print(arr[i]);
			i++;
			if(i<arr.length) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
}
