package com.sunbeam.ques1;
import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		System.out.println("Enter Part Number = ");
		Scanner sc = new Scanner(System.in);
		String pno = sc.next();
		
		System.out.println("Enter Product Description");
		String pdesc = sc.next();
		
		int quantityPurchased=0;
		System.out.println("Enter Quantity purchased = ");
		if(sc.hasNextInt()) {
			quantityPurchased= sc.nextInt();
			if(quantityPurchased<0) {
				quantityPurchased=0;
			}
		}
		else {
			sc.next();
		}
		
		double price = 0 ;
		System.out.println("Enter price = ");
		if(sc.hasNextDouble()) {
		 price= sc.nextDouble();
		 if(price<0) {
			 price=0.0;
		 }
		}
		else {
			sc.next();
		}
		
		Invoice v1=new Invoice(pno,pdesc,quantityPurchased,price);
		System.out.println("Part no = "+pno);
		System.out.println("Part description = "+pdesc);
		System.out.println("Quantity = "+quantityPurchased);
		System.out.println("Price = "+price);
		System.out.println("Total Invoice amount is = "+v1.getInvoiceAmount());
		
				
		
		
	}

}
