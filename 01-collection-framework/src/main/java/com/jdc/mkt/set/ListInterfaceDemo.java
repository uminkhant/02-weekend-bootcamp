package com.jdc.mkt.set;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterfaceDemo {

	private List<String> list;

	public ListInterfaceDemo(String name) {
		if (name.equals("array")) {
			list = new ArrayList<String>();
		} else {
			list = new LinkedList<String>();
		}
	}
	
	public void addList(String...strs) {
		list.addAll(List.of(strs));
	}
	
	public List<String> getList(){
		return list;
	}
}
