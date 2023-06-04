package com.jdc.mkt.generic;

public class GenericDemoThree {

	public static void main(String[] args) {
		
		ContainerThree<String> c1 = new ContainerThree<>();
		c1.setData("Hello Java Developer");
		doSomething(c1);
		
		GenericDemoThree three = new GenericDemoThree();
		String str = three.getValue(c1);
		System.out.println(str);
		
	}
	
	static<R> void doSomething(ContainerThree<R> data) {
		System.out.println(data.getData());
	}
	
	<R> R getValue(ContainerThree<R> data) {
		return data.getData();
	}
}

class ContainerThree<T>{
	
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}


