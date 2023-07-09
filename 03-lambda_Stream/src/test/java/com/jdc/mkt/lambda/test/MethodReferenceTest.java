package com.jdc.mkt.lambda.test;

import org.junit.jupiter.api.Test;

import com.jdc.mkt.Demo;
import com.jdc.mkt.MyInter;

public class MethodReferenceTest {

	@Test
	void test() {
		
		//lambda
		MyInter inter = (x,y) -> System.out.println(x+"\t"+y);
		inter.show("Aung Aung", "9/rer/232342");
		
		//instatnce method reference
		Demo demo = new Demo();
		MyInter inter2 = demo::instanceMethod;
		inter2.show("Thida", "mm23213");
		
		//static method reference
		MyInter inter3 = Demo::staticMethod;
		inter3.show("Aung Aung", "9/rer/232342");
		
		//constructor reference
		MyInter inter4 =Demo::new;
		inter4.show("Aung Aung", "9/rer/232342");	
		
	}
	
}
