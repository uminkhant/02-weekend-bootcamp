package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(OrderAnnotation.class)
public class FileTest {

	static File file;
	@Test
	@Order(1)
	void test1() throws IOException {
		File f = new File("parents");
		f.mkdir();

		 file = new File(f, "text.txt");
		// f.deleteOnExit();
		// assertFalse(f.exists());
		 file.createNewFile();
		assertTrue(file.exists());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());		

	}
	
	@Test
	@Order(2)
	void test2() throws FileNotFoundException {
		writeData();
		readData();
	}

	void readData() throws FileNotFoundException {
		try (FileInputStream fIn = new FileInputStream(file)) {

			int i = 0;
					
				while((i = fIn.read()) != -1){
					char ch = (char) i;
					System.out.print(ch);
				}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void writeData() {
		try (FileOutputStream fOut = new FileOutputStream(file)) {
			byte[]array = {72,69,76,76,79};
			fOut.write(array);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
