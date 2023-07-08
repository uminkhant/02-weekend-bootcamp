package com.jdc.mkt.test;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class DateTimeFormatTest {

	@Test
	@Order(1)
	void test() {
		var date = LocalDateTime.now();
		var fDate = date.format(DateTimeFormatter.ISO_DATE_TIME);
		
		var offset = OffsetDateTime.now();
		var oDate = offset.format(DateTimeFormatter.ISO_OFFSET_DATE);
		
		System.out.println(fDate);
		System.out.println(oDate);
		 
	}
	
	@Test
	@Order(2)
	void customFormatTest() {
		var df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		var dateTime = LocalDateTime.now();
		var fDate = dateTime.format(df);
		System.out.println(fDate);
	}	
	
}
