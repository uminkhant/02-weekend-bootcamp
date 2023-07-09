package com.jdc.mkt.test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class TemporalAccessorTest {

	
	@Test
	@Order(1)
	void testLocalDateTime() {
		var ldt = LocalDateTime.now();
		var year = ldt.get(ChronoField.YEAR);
		var month = ldt.get(ChronoField.MONTH_OF_YEAR);
		var day = ldt.get(ChronoField.DAY_OF_MONTH);
		System.out.println(year+"\t"+month+"\t"+day);
		
	}
	
	@Test
	@Order(2)
	void testFluent() {
		var ldt = LocalDateTime.now();
		var year = ldt.getYear();
		var month = ldt.getMonth();
		var day = ldt.getDayOfMonth();
		System.out.println(year+"\t"+month+"\t"+day);	
	}
	
	@Test
	@Order(3)
	void testAdjust() {
		var ldt = LocalDate.now();
		var cDate = ldt.with(ChronoField.DAY_OF_MONTH, 03);
		System.out.println(cDate.getDayOfMonth());
		
		TemporalAdjuster adj = new TemporalAdjuster() {
			
			@Override
			public Temporal adjustInto(Temporal temporal) {
				
				return LocalDate.of(temporal.get(ChronoField.YEAR),
						temporal.get(ChronoField.MONTH_OF_YEAR), 01);
			}
		};
		
		var adjDate = ldt.with(adj);
		System.out.println(adjDate);
		
	}
	
	@Test
	@Order(4)
	void testPlusMinus() {
		var ld = LocalDate.now();
		var minus = ld.minus(Period.ofDays(20));
		System.out.println(minus);
		var plus = ld.plus(Period.ofMonths(02));
		System.out.println(plus);
		
		var lt = LocalTime.now();
		var m = lt.minus(Duration.ofDays(02));
		System.out.println(m);
	}
	@Test
	@Order(5)
	@SuppressWarnings("static-access")
	void testTemporalAmount() {
		var res = Period
				.ofYears(02)
				.ofMonths(02)
				.ofDays(02);
		System.out.println(res);
		
		var res2 = Duration.between(LocalTime.now(), LocalTime.of(04, 00)).toHours();
		System.out.println(res2);
		
		var res3 = Period.between(LocalDate.now(), LocalDate.of(2023, 8, 23)).getMonths();
		System.out.println(res3);
		
	}
	
}
