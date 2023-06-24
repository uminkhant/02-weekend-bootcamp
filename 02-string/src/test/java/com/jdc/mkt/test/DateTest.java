package com.jdc.mkt.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(OrderAnnotation.class)
public class DateTest {

	@Test
	@Order(1)
	void testDate() throws ParseException {
		Date d = new Date();
		System.out.println(d);
		
		Calendar cl = Calendar.getInstance();
		Date d1 = cl.getTime();
		System.out.println(d1);
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date d2 = df.parse("23/02/2012");
		System.out.println(d2);
		
	}
	
	@Test
	@Order(2)
	void testCalender() {
		Calendar cl = Calendar.getInstance();
		cl.set(2000, 00,11);
		cl.set(Calendar.YEAR, 2011);
		cl.set(Calendar.DATE,05);
		cl.setLenient(true);
		cl.set(Calendar.MONTH, 30);
		Date d1 = cl.getTime();
		System.out.println(d1);
	}
	
	@Test
	@Order(3)
	void testCalenderAddOrRoll() {
		Calendar cl = Calendar.getInstance();
		cl.set(2023,06, 24);
		
		cl.add(Calendar.DATE, 32);
		System.out.println(cl.getTime());
		
		cl.roll(Calendar.DATE, 32);
		System.out.println(cl.getTime());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
