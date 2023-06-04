package com.jdc.mkt.annotation_test.utils;

import java.lang.reflect.Field;

import com.jdc.mkt.annotation_test.AnnotationDemoTwo;
import com.jdc.mkt.annotation_test.Message;
import com.jdc.mkt.annotation_test.Messages;

public class MyAnnoImpl {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		MyAnnoImpl imp = new MyAnnoImpl();
		imp.useFieldWithMyAnno();
		
		AnnotationDemoTwo.doSomething();
	}

	void useFieldWithMyAnno() {
		try {
			Field f = AnnotationDemoTwo.class.getDeclaredField("messages");
			Messages mess = f.getAnnotation(Messages.class);
			
			
			if(null != mess) {
				Message[] m = mess.value();
				for(Message s:m) {
					System.out.println(s.value());
				}
			}
			
			System.out.println("Test");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
