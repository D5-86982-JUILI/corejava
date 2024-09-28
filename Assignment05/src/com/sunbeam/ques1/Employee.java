package com.sunbeam.ques1;

import java.util.Scanner;

public class Employee {
	private String firstName;
	private String lastName;
	private int ssn;
	
	public Employee() {
		
	}

	public Employee(String firstName, String lastName, int ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter First Name -");
		firstName=sc.next();
		System.out.println("Enter Last Name -");
		lastName=sc.next();
		System.out.println("Enter SSN-");
		ssn=sc.nextInt();
	}
	public void display() {
		System.out.println("First Name ="+firstName);
		System.out.println("Last Name = "+lastName);
		System.out.println("SSN = "+ssn);
		
	}
	

}
