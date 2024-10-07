package com.Q1;
import java.util.Collection;
import java.util.Objects;
import java.util.Scanner;

public class Student1 {
	private int rollno;
	private String name;
	private int marks;
	
	
	public Student1() {
		
	}


	public Student1(int rollno, String name, int marks) {
		
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		return rollno == other.rollno;
	}


	public void accept(Scanner sc) {
		System.out.println("Enter Roll no - ");
		rollno=sc.nextInt();
		System.out.println("Enter Name - ");
		name = sc.next();
		System.out.println("Enter Marks - ");
		marks=sc.nextInt();
	}
	
	public void display() {
		System.out.println("Roll Number = "+rollno);
		System.out.println("Name - "+name);
		System.out.println("Marks - "+marks);
	}


	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	
	
}
