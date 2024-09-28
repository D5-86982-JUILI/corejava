package com.sunbeam.ques1;

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select type of employee:");
        System.out.println("1. Salaried Employee");
        System.out.println("2. Hourly Employee");
        System.out.println("3. Commission Employee");
        System.out.println("4. Base Salaried Commission Employee");

        int choice;
        System.out.println("Enter choice - ");
        choice = sc.nextInt();

        if (choice == 1) {
        Salaried e = new Salaried();
        e.accept(sc);
            e.display();
        }
        else if (choice == 2) {
        Hourly e = new Hourly();
        e.accept(sc);
            e.display();
        }
        else if (choice == 3) {
        Commission e = new Commission();
            e.accept(sc);
            e.display();
        }
        else if (choice == 4) {
        BaseSalaried e = new BaseSalaried();
        e.accept(sc);
            e.display();
        }
        else {
            System.out.println("Invalid choice...");
            return;
        }

    }
}