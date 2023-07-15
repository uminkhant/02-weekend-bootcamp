package com.jdc.mkt.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ObjectStreamTest {

	static File file;
	static List<Student> students;

	@BeforeAll
	static void init() throws IOException {
		file = new File("test.obj");
		students = new ArrayList<Student>();

		if (!file.exists()) {
			file.createNewFile();
		}

	}

	@Test
	void test1() {
		addStudent();
		writeObject();
		System.out.println(readObject().size());
	}

	void showData() {

	}

	void addStudent() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String result = "";
			int id = 0;
			
			if (readObject().size() > 0) {
				students = readObject();
				id = readObject().size();
			}
			do {
				id++;
				System.out.println("Type name !");
				String name = br.readLine();
				System.out.println("Type  age !");
				int age = Integer.parseInt(br.readLine());
				var stu = new Student(id, name, age);
				students.add(stu);
				System.out.println("Do you want to add again y/other");
				result = br.readLine();

			} while ("y".equalsIgnoreCase(result));

		} catch (Exception e) {
			e.getMessage();
		}
	}

	void writeObject() {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {

			out.writeObject(students);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	List<Student> readObject() {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
			return (List<Student>) in.readObject();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}

class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
