package com.sunbeam.ques1;

import java.util.Scanner;
import com.sunbeam.ques1.Point2D;



public class TestPointArray {


public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of points to plot: ");
int points = sc.nextInt();

Point2D[] arr = new Point2D[points];

for(int i = 0; i <arr.length; i++) {
System.out.print("Enter x and y coordinates for point " + (i+1)+ " : " );
double x = sc.nextDouble();
double y = sc.nextDouble();

arr[i] = new Point2D(x,y);
}

int choice;

do {
System.out.println("\nMENU\n");
System.out.println("1. Display details of a specific point: ");
System.out.println("2. Display x, y co-ordinates of all points: " );
System.out.println("3. Display distance between specified points: ");
System.out.println("4. EXIT");
System.out.print("Enter your Choice: ");
choice = sc.nextInt();

switch(choice) {
case 1:
System.out.println("Enter the index of point (0 to " + (points-1) + " ): " );
int index = sc.nextInt();

if (index >= 0 && index < points) {
System.out.println("Point at index " +index+": " + arr[index].getDetails());
}
else {
System.out.println(" Invalid index , pls retry!!!!");
}
break;

case 2:
System.out.println("All Points: ");
for(Point2D point:arr) {
System.out.println( point.getDetails());
}
break;

case 3:
System.out.println("Enter The index of first point: ");
int index1 = sc.nextInt();

System.out.println("Enter The index of Second point: ");
int index2 = sc.nextInt();

if(index1>= 0 && index1 < points && index2>=0 && index2<points )
if(!arr[index1].isEqual(arr[index2])){

double distance = arr[index1].CalculateDistance(arr[index2]);
System.out.println("Distance between points is: " + distance);
}else {
System.out.println("Points are Located at the same position");
}else {
System.out.println("Invalid indices");
}
break;

case 4:
System.out.println("Exiting...");
break;

default:
System.out.println("Inalid Choice Entered");
}

} while(choice != 4);

}

}