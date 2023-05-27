package com.jdc.solid_principles.interfaceSegerate;

public class InterfaceSegerateDemo {

	public static void main(String[] args) {
		
	}
	
	interface Human{
		void sleep();
		void eat();
		
	}
	interface TeWork{
		void teaching();
	}
	
	interface StWork{
		void study();
	}
	
	class Teacher implements Human,TeWork{

		@Override
		public void sleep() {
			
		}

		@Override
		public void eat() {
			
		}


		@Override
		public void teaching() {
			// TODO Auto-generated method stub
			
		}
		
	}
	class Student implements Human,StWork{

		@Override
		public void sleep() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void eat() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void study() {
			// TODO Auto-generated method stub
			
		}

		}
}
