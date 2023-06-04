package com.jdc.mkt.annotation_test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnotationDemo {

	@MyAnno(value = 2, name = "William")
	private String name;

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, NoSuchFieldException {
		AnnotationDemo demo = new AnnotationDemo();
		demo.useAnnoWithMyAnno();
		demo.useFieldWithMyAnno();
	}

	@MyAnno(name = "Andrew")
	void useAnnoWithMyAnno() throws NoSuchMethodException, SecurityException, NoSuchFieldException {

		Method m = AnnotationDemo.class.getDeclaredMethod("useAnnoWithMyAnno");
		MyAnno anno = m.getAnnotation(MyAnno.class);

		if (null != anno) {
			System.out.println("Name : " + anno.name() + "\tvalue : " + anno.value());
		} else {
			System.out.println("Something Wrong");
		}
	}

	void useFieldWithMyAnno() throws NoSuchFieldException, SecurityException {
		Field f = AnnotationDemo.class.getDeclaredField("name");
		MyAnno anno = f.getAnnotation(MyAnno.class);

		if (null != anno) {
			System.out.println("Name : " + anno.name() + "\tvalue : " + anno.value());
		} else {
			System.out.println("Something wrong");
		}

	}
}



@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.FIELD })
@interface MyAnno {
	
	static final int DATA = 50;

	int value() default 1;

	String name();
	
	class Test{}

}
