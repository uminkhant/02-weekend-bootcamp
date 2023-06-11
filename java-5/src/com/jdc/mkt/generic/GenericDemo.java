package com.jdc.mkt.generic;

public class GenericDemo {

	public static void main(String[] args) {
		
		Data<String> d1 = new Data<>();
		//d1.setValue("Hello");
		System.out.println(d1.getValue());
		
		Data<Integer> d2 = new Data<>();
		d2.setValue(50);
		System.out.println(d2.getValue());
		
		Data<Human> d3 = new Data<>();
		d3.setValue(new Human());
		System.out.println(d3.getValue().getMessage());
		
		
	}
}
class Human{
	String getMessage() {
		return "Human class";
	}
}

class Data<T>{
	
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
}
