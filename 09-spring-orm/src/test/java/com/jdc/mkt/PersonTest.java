package com.jdc.mkt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.mkt.entity.Person;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@SpringJUnitConfig(locations = "classpath:/application.xml")
public class PersonTest {

	@Autowired
	private EntityManagerFactory emf;

	@Test
	void test1() {
		emf = Persistence.createEntityManagerFactory("spring-orm");
		var em = emf.createEntityManager();

		var p = new Person();
		p.setName("William");
		p.setAge(30);

		em.persist(p);
	}
}
