package com.Q3;

import java.util.Scanner;

public class Reverse{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String S1 = scanner.nextLine();
        
        StringBuilder reversed = new StringBuilder(S1).reverse();
        System.out.println("Reversed string: " + reversed);
    }
}

