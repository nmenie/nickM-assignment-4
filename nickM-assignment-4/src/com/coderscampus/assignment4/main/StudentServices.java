package com.coderscampus.assignment4.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StudentServices {

	public Students[] getStudentsFromFile() {
		BufferedReader fileReader = null;
		Students[] s = new Students[100];

		int i = 0;

		try {
			fileReader = new BufferedReader(new FileReader("student-master-list.csv"));

			String line;
			fileReader.readLine();
			while ((line = fileReader.readLine()) != null) {

				String[] student = line.split(",");
				Students stud = studentServices(student);
				s[i] = stud;
				i = i + 1;

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {

				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return s;

	}

	public Students studentServices(String[] student) {
		int id = Integer.parseInt(student[0]);
		String name = student[1];
		String course = student[2];
		int grade = Integer.parseInt(student[3]);

		Students students = new Students(id, name, course, grade);

		return students;
	}

}
