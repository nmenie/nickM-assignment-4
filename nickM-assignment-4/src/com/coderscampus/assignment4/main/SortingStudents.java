package com.coderscampus.assignment4.main;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class SortingStudents {

	public static void main(String[] args) throws IOException {

		StudentServices studentServices = new StudentServices();
		Students[] s = studentServices.getStudentsFromFile();

		Students[] compsci = new Students[34];
		Students[] stat = new Students[33];
		Students[] apmth = new Students[33];
		int comp1 = 0;
		int stat1 = 0;
		int amth1 = 0;

		Arrays.sort(s);
		for (Students stu : s) {

			if (stu.getCourse().contains("COMPSCI")) {
				compsci[comp1] = stu;
				comp1 = comp1 + 1;
				System.out.println(compsci);

			}
			if (stu.getCourse().contains("STAT")) {
				stat[stat1] = stu;
				stat1 = stat1 + 1;
				System.out.println(stat);

			}
			if (stu.getCourse().contains("APMTH")) {
				apmth[amth1] = stu;
				amth1 = amth1 + 1;
				System.out.println(apmth);

			}
		}

		BufferedWriter writer = null;

		writer = new BufferedWriter(new FileWriter("course1.csv"));

		writer.write("Student Id,Student Name,Course,Grade \n");

		for (int i = 0; i < compsci.length; i++) {

			writer.write(compsci[i].getId() + "," + compsci[i].getName() + "," + compsci[i].getCourse() + ","
					+ compsci[i].getGrade());
			writer.newLine();

		}
		writer.close();

		writer = new BufferedWriter(new FileWriter("course2.csv"));

		writer.write("Student Id,Student Name,Course,Grade \n");

		for (int i = 0; i < stat.length; i++) {

			writer.write(stat[i].getId() + "," + stat[i].getName() + "," + stat[i].getCourse() + ","
					+ stat[i].getGrade());
			writer.newLine();
		}
		writer.close();

		writer = new BufferedWriter(new FileWriter("course3.csv"));

		writer.write("Student Id,Student Name,Course,Grade \n");

		for (int i = 0; i < apmth.length; i++) {

			writer.write(apmth[i].getId() + "," + apmth[i].getName() + "," + apmth[i].getCourse() + ","
					+ apmth[i].getGrade());
			writer.newLine();
		}
		writer.close();

	}

}
