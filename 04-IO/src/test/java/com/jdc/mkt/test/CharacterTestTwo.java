package com.jdc.mkt.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class CharacterTestTwo {

	static File file;

	@BeforeAll
	static void init() throws IOException {
		file = new File("test.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
	}

	@Test
	void test1() {
		readData();
	}

	void writeData(String message) {
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.write(message);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void readData() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(file)) {
			String res = "";
			String message = "";

			do {
				System.out.println("Type Message !");
				message = br.readLine();

				if (!res.isEmpty()) {
					pw.println();
					pw.append(message);
				} else {
					pw.write(message);
				}

				System.out.println("Do you want to add again y/other");
				res = br.readLine();

			} while ("y".equalsIgnoreCase(res));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
