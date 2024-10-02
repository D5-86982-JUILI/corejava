package com.Q1;

public class Student {
	private int roll;
	private String name;
	private String city;
	 protected int marks;
	
	
	public Student() {
		
	}


	public Student(int roll, String name, String city, int marks) {
		
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public double compareTo(Student s) {
		return this.marks - s.marks;
		
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}
	
	
	
	
	

}
