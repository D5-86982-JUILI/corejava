package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the basket size: ");
int basketSize = scanner.nextInt();
Fruit[] basket = new Fruit[basketSize];
int counter = 0;
while (true) {
System.out.println("Options:");
System.out.println("0. Exit");
System.out.println("1. Add Mango");
System.out.println("2. Add Orange");
System.out.println("3. Add Apple");
System.out.println("4. Display names of all fruits");
System.out.println("5. Display details of all fresh fruits");
System.out.println("6. Display tastes of all stale fruits");
System.out.println("7. Mark a fruit as stale");
System.out.println("8. Mark all sour fruits stale");

int choice = scanner.nextInt();

switch (choice) {
case 0:
System.exit(0);
case 1:
 if (counter < basketSize) {
 System.out.print("Enter weight: ");
 double weight = scanner.nextDouble();
 System.out.print("Enter color: ");
 String color = scanner.next();
 basket[counter++] = new Mango(color,weight,"Mango" );
 } else {
   System.out.println("Basket is full!");
}
  break;
 case 2:
 if (counter < basketSize) {
 System.out.print("Enter weight: ");
 double weight = scanner.nextDouble();
 System.out.print("Enter color: ");
 String color = scanner.next();
 basket[counter++] = new Orange(color, weight,"Orange" );
 } else {
  System.out.println("Basket is full!");
  }
  break;
  case 3:
 if (counter < basketSize) {
  System.out.print("Enter weight: ");
  double weight = scanner.nextDouble();
  System.out.print("Enter color: ");
  String color = scanner.next();
  basket[counter++] = new Apple(color,weight,"Apple");
  } else {
  System.out.println("Basket is full!");
  }
  break;
  case 4:
  for (Fruit fruit : basket) {
  if (fruit != null) {
 System.out.println(fruit.getName());
}
}
 break;
                    
case 5:
 for (Fruit fruit : basket) {
 if (fruit != null && fruit.isFresh()) {
 System.out.println(fruit.toString() + ", taste: " + fruit.taste());
   }
}
break;
 case 6:
 for (Fruit fruit : basket) {
 if (fruit != null && !fruit.isFresh()) {
  System.out.println(fruit.taste());
 }
}
break;
case 7:
 System.out.print("Enter index to mark as stale: ");
 int index = scanner.nextInt();
 if (index >= 0 && index < basketSize && basket[index] != null) {
 basket[index].setFresh(false);
} else {
  System.out.println("Invalid index!");
}
 break;
case 8:
for (Fruit fruit : basket) {
if (fruit != null && "sour".equals(fruit.taste())) {
fruit.setFresh(false);
  }
}
break;
default:
System.out.println("Invalid option!");
}
}
}
}
