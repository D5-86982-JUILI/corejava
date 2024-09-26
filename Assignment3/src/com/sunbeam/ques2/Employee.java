package com.sunbeam.ques2;

public class Employee {
	String first_Name;
	String last_Name;
	double monthly_Sal;
	
	public Employee() {
		
	}

	public Employee(String first_Name, String last_Name, double monthly_Sal) {
		
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.monthly_Sal = monthly_Sal;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public double getMonthly_Sal() {
		return monthly_Sal;
	}

	public void setMonthly_Sal(double monthly_Sal) {
		this.monthly_Sal = monthly_Sal;
	}
	
	
	public double getYearlySalary() {
		return monthly_Sal*12;
	}
	public void giveRaise() {
		   if (monthly_Sal > 0) {
		       double raise = monthly_Sal * 0.10;
		       this.monthly_Sal = monthly_Sal + raise;
		   }
		}
	public void display() {
		System.out.println("Name : "+first_Name+" "+last_Name);
		System.out.println("Monthly Salary : "+monthly_Sal);
		System.out.println("Yearly Salary : "+getYearlySalary());
		}

		
	
	

}