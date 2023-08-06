package com.jdc.mkt.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.mkt.config.ApplicationConfig;
import com.jdc.mkt.dto.Category;
import com.jdc.mkt.dto.ProductDto;

@SpringJUnitConfig(classes = ApplicationConfig.class)
public class ProductTest {

	@Autowired
	private JdbcOperations insert;
	@Autowired
	private NamedParameterJdbcTemplate template;

	// @Test
	@Sql(scripts = "classpath:ddlTestDb.sql")
	@Sql(statements = { "insert into category (name) values ('Fruits')",
			"insert into category (name) values ('Drinks')",
			"insert into product (name,price,cat_id) values ('Orange',2000,1)",
			"insert into product (name,price,cat_id) values ('Apple',1000,1)",
			"insert into product (name,price,cat_id) values ('OrangeJuice',2000,2)", })
	void test1(@Value("${p.findById}") String sql) {
		var mapper = new BeanPropertyRowMapper<ProductDto>(ProductDto.class);
		var p = insert.queryForObject(sql, mapper, 1);
		System.out.println(p.getCategory().getName() + "\t" + p.getName());
	}

	@Test
	void test2(@Value("${p.update}") String params) {
		var cat = template.queryForObject("select * from category where id= :id", Map.of("id", 1),
				new DataClassRowMapper<Category>(Category.class));
		System.out.println(cat.getName());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Lemon");
		map.put("price", "300");
		map.put("id", 1);
		var row = template.update(params, map);
		System.out.println(row);

	}

}
