package com.jdc.mkt.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class DateTimeTest {

	@Test
	@Order(1)
	void createDate() {
		System.out.println(Instant.now());
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
	}
	
	@Test
	@Order(2)
	void specificTimeTest() {
		System.out.println(LocalDate.of(99, 12, 12));
		
	}
	
	@Test
	@Order(2)
	void humanToMechineTest() {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		Instant time1 = ldt.toInstant(ZoneOffset.UTC);
		System.out.println(time1);
		
		var zone = ZonedDateTime.now();
		System.out.println(zone);
		
		var time2 = zone.toInstant();
		System.out.println(time2);
		
		var zone1 = time2.atZone(ZoneId.of("America/Phoenix"));
		System.out.println(zone1);
		
		var offset = OffsetDateTime.now();
		System.out.println(offset);
		
		
		var time3 = offset.toInstant();
		System.out.println(time3);
		
		var off1 = time3.atOffset(ZoneOffset.of("+03:30"));
		System.out.println(off1);
		
	}
	
	
}











