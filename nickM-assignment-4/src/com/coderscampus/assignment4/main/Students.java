package com.coderscampus.assignment4.main;

public class Students implements Comparable<Students> {

	private String name;
	private String course;
	private Integer id;
	private Integer grade;
	private String stat;
	private String apmth;
	private String compsci;
	

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public String getApmth() {
		return apmth;
	}

	public void setApmth(String apmth) {
		this.apmth = apmth;
	}

	public String getCompsci() {
		return compsci;
	}

	public void setCompsci(String compsci) {
		this.compsci = compsci;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer  id) {
		this.id = id;
	}

	public Integer  getGrade() {
		return grade;
	}

	public void setGrade(Integer  grade) {
		this.grade = grade;
	}

	public Students(Integer  id, String name, String course, Integer  grade) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.grade = grade;

	}

	public Students() {

	}

	@Override
	public int compareTo(Students that) {
		if (this.grade == that.grade) {
			return 0;
			
			
		} else if (this.grade > that.grade) {
			return -1;
		}
		
		return 1;
		


		

	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", course=" + course + ", id=" + id + ", grade=" + grade + ", stat=" + stat
				+ ", apmth=" + apmth + ", compsci=" + compsci + "]";
	}
}
