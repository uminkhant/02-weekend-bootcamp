package com.jdc.mkt.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceDemo {

	private Set<Person> set;

	public SetInterfaceDemo(String name) {
		switch (name) {
		case "hash":
			set = new HashSet<Person>();
			break;
		case "tree":
			set = new TreeSet<Person>();
			break;
		default:
			set = new LinkedHashSet<Person>();
			break;
		}

	}

	public void addSet(Person... persons) {
		for (Person s : persons) {
			set.add(s);
		}
	}

	public Set<Person> getSet() {
		return set;
	}
}
