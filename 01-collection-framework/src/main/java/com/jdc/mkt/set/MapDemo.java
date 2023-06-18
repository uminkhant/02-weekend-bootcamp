package com.jdc.mkt.set;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	private  Map<Integer, Person> map;
	
	public MapDemo(String m) {
		switch(m) {
		case"hash":
			map = new HashMap<Integer, Person>();
			break;
		case "tree":
			map = new TreeMap<Integer, Person>();
			break;
		case "link":
			map = new LinkedHashMap<Integer, Person>();
			break;
		}
	}
	
	public void addMap(int key,Person value) {
		map.put(key, value);
	}
	
	public Map<Integer, Person> getMap(){
		return map;
	}
}
