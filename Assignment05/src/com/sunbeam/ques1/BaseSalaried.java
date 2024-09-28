package com.sunbeam.ques1;
import java.util.Scanner;

public class BaseSalaried extends Commission {
	private int baseSalary;
	
	public BaseSalaried() {
		super();
	}

	public BaseSalaried(String firstName, String lastName, int ssn,int grossSales,int commissionRate,int baseSalary) {
		super(firstName,lastName,ssn,grossSales,commissionRate);
		this.baseSalary = baseSalary;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter base salary - ");
		baseSalary=sc.nextInt();
	}
	
	public void display() {
		super.display();
		System.out.println("Base salary = "+baseSalary);
		System.out.println("Total Salary = "+calculatePayofCommission());
	}
	public void addbonus() {
		baseSalary+=baseSalary*0.10;
		
	}
	
	public int calculatePayofCommission() {
		  return baseSalary + super.calculatePayofCommission();

	}
}
