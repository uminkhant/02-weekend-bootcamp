package com.jdc.mkt.generic;

public class GenericDemoTwo {

	public static void main(String[] args) {
		
		Container<Integer,String> c1 = new Container<>();
		c1.setKey(1);
		c1.setValue("Hello");	
		System.out.println(c1.getPair());
	}
}

class Container<K,V> implements Pair<K,V>{
	
	private K key;
	private V value;
	
	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String getPair() {
		return "Key : "+key+"\tValue : "+value ;
	}	
}


interface Pair<K,V>{
	void setKey(K k);
	void setValue(V v);
	String getPair();
}
