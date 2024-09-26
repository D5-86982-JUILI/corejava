package com.sunbeam.ques2;


public class EmployeeTest {

public static void main(String[] args) {

Employee e1 = new Employee("Avantika","Chaudhari",88000);
Employee e2 = new Employee("Shruti","Patil",88000);
Employee e3 = new Employee("Manasvi","Joshi",88000);

System.out.println("BEFORE RAISE");
e1.display();
System.out.println("---------------------------------------");
e2.display();
System.out.println("---------------------------------------");
e3.display();

System.out.println("\n**************************************\n");
e1.giveRaise();
e2.giveRaise();
e3.giveRaise();

System.out.println("AFTER RAISE");
e1.display();
System.out.println("---------------------------------------");
e2.display();
System.out.println("---------------------------------------");
e3.display();


}

}