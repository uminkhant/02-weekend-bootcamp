package com.jdc.mkt.generic;

public class GenericDemoFour {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		ContainerFour<?> a = new ContainerFour<>();
		ContainerFour<?> b = new ContainerFour<>();	
		ContainerFour<CRUDdb> cr = new ContainerFour<>();
		
	}
	
	static void doSomething(ContainerFour<?> t) {
		
	}
}

class ContainerFour<T extends CRUDdb> {
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

interface CRUDdb{
	void create();
	void update();
	
}
class A implements CRUDdb{

	@Override
	public void create() {}

	@Override
	public void update() {}
	
}
class B  implements CRUDdb{

	@Override
	public void create() {}

	@Override
	public void update() {}}
class C  implements CRUDdb{

	@Override
	public void create() {}

	@Override
	public void update() {}}
class D implements CRUDdb{

	@Override
	public void create() {}

	@Override
	public void update() {}}



