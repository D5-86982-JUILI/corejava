package com.sunbeam.ques1;

import java.util.Scanner;

public class Hourly extends Employee {
	private int wage;
	private int hrs;
	
	public Hourly() {
		super();
	}

	public Hourly(String firstName, String lastName, int ssn,int wage, int hrs) {
		super(firstName,lastName,ssn);
		this.wage = wage;
		this.hrs = hrs;
	}

	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter wages - ");
		wage = sc.nextInt();
		System.out.println("Enter hours - ");
		hrs = sc.nextInt();
	}
	
	public void display() {
		super.display();
		System.out.println("Wages - "+wage);
		System.out.println("Hours - "+hrs);
		System.out.println("Total Salary = "+calculatePay());
	}
	public double calculatePay() {
        if (wage  <= 40) {
            return hrs * wage;
        } else {
            return (hrs * 40) + ((wage - 40) * hrs * 1.5);
        }
    }


}
