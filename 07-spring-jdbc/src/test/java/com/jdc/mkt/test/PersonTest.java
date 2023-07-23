package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.mkt.dao.PersonDao;

@SpringJUnitConfig(locations = "/application.xml")
public class PersonTest {

	@Autowired
	private PersonDao dao;
	
	@ParameterizedTest
	@Sql(scripts = "classpath:/personTable.sql")
	@CsvSource("Sandar,30")
	void test1(String name,int age) {
		var res = dao.insertPerson(name, age);
		assertEquals(1, res);
	}
}
