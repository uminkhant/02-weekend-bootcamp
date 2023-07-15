package com.jdc.mkt.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DataTest {

	static File file;

	@BeforeAll
	static void init() throws IOException {
		file = new File("test.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
	}
	
	@ParameterizedTest
	@CsvSource(value ={"Aung Aung:23:true","Andrew:30:false"},delimiter = ':')
	void test1(String name,int age,boolean active) {
		writeData(name, age,active);
		readData();
	}
	
	void writeData(String name ,int age,boolean active) {
		try(DataOutputStream dout = new DataOutputStream(new FileOutputStream(file))){		
			dout.writeUTF(name);
			dout.writeInt(age);
			dout.writeBoolean(active);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void readData() {
		try(DataInputStream dIn = new DataInputStream(new FileInputStream(file))){		
			Person p = new Person(dIn.readUTF(), dIn.readInt(),dIn.readBoolean());
			System.out.println(p);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	class Person{
		private String name ;
		private int age;
		private boolean isActive;
		public Person(String name, int age,boolean isActive) {
			super();
			this.name = name;
			this.age = age;
			this.isActive = isActive;
		}
		
		@Override
		public String toString() {
			return name +"\t"+age + "\t"+ isActive;
		}
		
	}
}
