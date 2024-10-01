package com.Q1.exception;

import java.util.Scanner;



public class Program01 extends ExceptionLineTooLong {
	public static void toCheckLength(String str) throws ExceptionLineTooLong {
        if (str.length() > 80) {
            throw new ExceptionLineTooLong("The string is too long");
        }
    }

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String s1;
		System.out.println("Enter a string - ");
		s1=sc.nextLine();
		try {
			toCheckLength(s1);
		}catch(ExceptionLineTooLong e){
			e.printStackTrace();
		}
		
		
			
		
		
	}
	



	
	
}
