package com.Q1;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

class StudentRoll implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		
		return o1.getRollno()-o2.getRollno();
	}
}
	class StudentName implements Comparator<Student1>{

		@Override
		public int compare(Student1 o1, Student1 o2) {
			return o1.getName().compareTo(o2.getName());
		}

	}
	class StudentMarks implements Comparator<Student1>{

		@Override
		public int compare(Student1 o1, Student1 o2) {
			
			return o1.getMarks()-o2.getMarks();
		}
		
	}

public class Program01 {
	public static void main(List<?>l1) {
		for(Object s:l1) {
			System.out.println(s);
		}
			
	}
	
        
        
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" MENU ");
		System.out.println("0.Exit ");
		System.out.println("1.Add Student");
		System.out.println("2.Display all Students");
		System.out.println("3.Search on rollno and Display it");
		System.out.println("4.Sort the Students by the Roll number  ");
		System.out.println("5.Sort the Students by the name ");
		System.out.println("6.Sort the Students by the Marks");
		System.out.println("Enter your Choice - ");
		return sc.nextInt();
		
	}
	
	
	
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in); 
		List <Student1> s = new LinkedList <Student1>();
		int choice;
		while((choice=menu())!=0) {
			switch (choice) {
			case 0:System.exit(0);
			break;
			
			case 1: System.out.print("Enter roll number: ");
            int rollno = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            s.add(new Student1(rollno, name, marks));
            System.out.println("Student added successfully.");
            break;
			case 2:
				Iterator<Student1> itr = s.iterator();
                while (itr.hasNext()) {
                    System.out.println(itr.next());
                }
                break;
                
                
			case 3:
				System.out.print("Enter Roll No to search: ");
                rollno = sc.nextInt();
                Student1 search = new Student1(rollno, null, 0);
                if (s.contains(search)) {
                    for (Student1 s1 : s) {
                        if (s1.equals(search)) {
                            System.out.println(s1);
                            break;
                        }
                    }
                } else {
                    System.out.println("Student not found...");
                }
                break;
                
			case 4:
				StudentRoll sr =new StudentRoll();
				Collections.sort(s,sr);
				for(Student1 s1:s) {
					System.out.println(s1);
				}
				
				break;
			case 5:
				StudentName sn = new StudentName();
				Collections.sort(s,sn);
				for (Student1 s2:s) {
					System.out.println(s2);
				}
				break;
				
			case 6:
				StudentMarks sm = new StudentMarks();
				Collections.sort(s,sm);
				for (Student1 s3:s) {
					System.out.println(s3);
				}
				break;
				
				
			default:
				System.out.println("Enter a valid choice!");
				break;
			}
		}
	}
	
	

}
