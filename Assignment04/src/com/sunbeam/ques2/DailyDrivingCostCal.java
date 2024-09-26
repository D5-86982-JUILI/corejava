package com.sunbeam.ques2;
import java.util.Scanner;

public class DailyDrivingCostCal {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter total miles driven per day: ");
double milesPerDay = sc.nextDouble();

System.out.println("Enter cost per Gallons: ");
double costPerGallons = sc.nextDouble();

System.out.println("Enter total miles per gallons: ");
double milesPerGallons = sc.nextDouble();

System.out.println("Enter the parking fees per day: ");
double parkingFees= sc.nextDouble();

System.out.println("Enter tolls per day: ");
double tollsPerDay = sc.nextDouble();

double gasolinePerDay = (milesPerDay / milesPerGallons) *costPerGallons;

double totalCostPerDay = gasolinePerDay + parkingFees + tollsPerDay;

System.out.println("Total cost per day is " + totalCostPerDay);


}

}