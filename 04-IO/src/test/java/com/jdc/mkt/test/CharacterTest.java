package com.jdc.mkt.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CharacterTest {

	static File file ;
	
	@BeforeAll
	static void init() throws IOException {
		file = new File("test.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
	}
	
	
	
	@ParameterizedTest
	@ValueSource(strings = "William")
	void test1(String str) {
		writeData(str);
		readData();
	}
	
	void writeData(String str) {
		try(FileWriter fw = new FileWriter(file,true)){
			
			fw.write(str);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	void readData() {
		try(FileReader fr = new FileReader(file)){
			
			int i = 0;
			String str = "";
			
			while((i = fr.read()) != -1) {
				char c =(char) i;
				str = str+String.valueOf(c);
			}
			System.out.println(str);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
