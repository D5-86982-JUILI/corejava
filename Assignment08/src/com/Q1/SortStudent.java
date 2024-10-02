package com.Q1;

import java.util.Comparator;
import java.util.Arrays;
import java.util.Scanner;

public class SortStudent{
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice - ");
		System.out.println("0.Exit");
		System.out.println("1.Sort on the basis of City");
		System.out.println("2.Sort on the basis of Marks");
		System.out.println("3.Sort on the basis of Name ");
		return sc.nextInt();
	}
	
	

	public static void main(String[] args) {
		
		
		
		Student arr[]=new Student[5];
		
		
		
	    arr[0]= new Student(1,"Arun","Pune",65);
	    arr[1]= new Student(2,"Neha","Kolhapur",68);
	    arr[2]= new Student(3,"Ankita","Mumbai",70);
	    arr[3]= new Student(4,"Akash","Pune",80);
	    arr[4]= new Student(1,"Pooja","Pune",90);
	    
		int choice;
		while((choice=menu())!=0) {
			switch (choice) {
			case 1:
              
				Arrays.sort(arr, new Comparator<Student>() {
                    @Override
                    public int compare(Student s1, Student s2) {
                        return s1.getCity().compareTo(s2.getCity());
                    }
                });
				System.out.println("Sorted students:");
	            for (Student student : arr) {
	                System.out.println(student);
	            }
				
				break;
				
			case 2:
				
				 Arrays.sort(arr, new Comparator<Student>() {
                     @Override
                     public int compare(Student s1, Student s2) {
                         return Double.compare(s2.getMarks(), s1.getMarks());
                     }
                 });
				 System.out.println("Sorted students:");
		            for (Student student : arr) {
		                System.out.println(student);
		            }
				break;
				
			case 3:
				 Arrays.sort(arr, new Comparator<Student>() {
                     @Override
                     public int compare(Student s1, Student s2) {
                         return s1.getName().compareTo(s2.getName());
                     }
                 });
				 System.out.println("Sorted students:");
		            for (Student s1 : arr) {
		                System.out.println(s1);
		            }
				
				break;
			case 0:
				System.exit(0);
				break;

			default:
				System.out.println("Enter valid choice!");
				break;
				
			}
		}
		
	}

	@Override
	public String toString() {
		return "SortStudent [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}



	

}
