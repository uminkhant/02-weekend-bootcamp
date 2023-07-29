package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Types;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.mkt.config.ApplicationConfig;
import com.jdc.mkt.dto.Person;

@SpringJUnitConfig(classes = ApplicationConfig.class)
@TestMethodOrder(OrderAnnotation.class)
public class PersonTestThree {

	@Value("${p.selectById}")
	private String selectById;
	@Autowired
	private JdbcOperations jdbc;

	@Test
	@Order(1)
	@DisplayName("1.use query with preparedstatment creator")
	void test1() {
		var factory = new PreparedStatementCreatorFactory(selectById, Types.INTEGER);
		var creator = factory.newPreparedStatementCreator(List.of(1));

		var person = jdbc.query(creator, rs -> {
			while (rs.next()) {
				var p = new Person();
				p.setName(rs.getString("name"));
				p.setAge(rs.getInt("age"));
				return p;
			}
			return null;
		});

		assertNotNull(person);
		assertEquals("Wanna", person.getName());

	}
}
