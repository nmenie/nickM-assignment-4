package com.coderscampus.assignment4.main;


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;





public class SortingStudents {

	public static void main(String[] args) {
		
		StudentServices studentServices = new StudentServices();
		Students[] s = studentServices.getStudentsFromFile();
		
		
		 Arrays.sort(s);
	        for(Students stu : s) {
	        	System.out.println(stu.getApmth());
	        	
	        }
	        

	        Students[] stat = new Students[33];
	        
	        stat[0] = new Students();
	         
	        
	        
	        
	        
	        

	

	}

}
