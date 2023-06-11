package com.jdc.mkt.generic;

public class BoundTypeDemo {

	public static void main(String[] args) {
		
		ContainerFive<Y> c  = new ContainerFive<>();
		upperBound(c);
		lowerBound(c);
		
		ContainerFive<? extends Y> c1 = new ContainerFive<>();
		c1.getData();
		
	}
	
	static void upperBound(ContainerFive<? extends Y> c1) {
			c1.getData();
	}
	static void lowerBound(ContainerFive<? super Y> c1) {
		c1.setData(new Z());
		c1.getData();
	}
	
}

class X{}
class Y extends X{}
class Z extends Y{}

	class ContainerFive<T>{
		
		private T data;

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}
		
		
	}

