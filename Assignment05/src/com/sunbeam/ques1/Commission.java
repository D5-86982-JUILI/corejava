package com.sunbeam.ques1;
import java.util.Scanner;

public class Commission extends Employee {
	private int grossSales;
	private int commissionRate;
	
	public Commission() {
		super();
	}

	public Commission(String firstName, String lastName, int ssn,int grossSales, int commissionRate) {
		super(firstName,lastName,ssn);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public int getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}

	public int getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(int commissionRate) {
		this.commissionRate = commissionRate;
	}
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter gross sales - ");
		grossSales = sc.nextInt();
		System.out.println("Enter commission -");
		commissionRate=sc.nextInt();
	}
	
	public void display() {
		super.display();
		System.out.println("Gross sales = "+grossSales);
		System.out.println("Commission = "+commissionRate);
		System.out.println("Total Salary - "+calculatePayofCommission());
	}
	
	public int calculatePayofCommission() {
		  return grossSales*commissionRate;
		 }

}
