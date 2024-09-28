package com.sunbeam.ques1;
import java.util.Scanner;

public class Salaried extends Employee{
	private int weeklySalary;
	public Salaried() {
		super();
	}
	
	public Salaried(String firstName, String lastName, int ssn,int weeklySalary) {
		super(firstName,lastName,ssn);
		this.weeklySalary = weeklySalary;
	}

	public int getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(int weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter weekly Salary-");
		weeklySalary=sc.nextInt();
	}
	public void display() {
		super.display();
		System.out.println("Weekly Salary = "+weeklySalary);
	}
	
//	public void calculatePayofSalaried() {
//		System.out.println("Weekly Salary - "+weeklySalary);
//	}
	
	

}
