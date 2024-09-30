package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	private String color;
	private double weight;
	 String name;
	 boolean isFresh=true;
	 
	 
	
	public Fruit() {
		
	}


	public Fruit(String name) {
		this.name=name;	
	}
	

	public Fruit(String color, double weight, String name) {
		
		this.color = color;
		this.weight = weight;
		this.name = name;
	}


	
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh
				+"]";
	}
	
	
	public String taste() {
		return "No specific taste";
		
	}
	public void accept(Scanner sc) {
		System.out.println("Enter color of Fruit-");
		color=sc.next();
		System.out.println("Enter weight of Fruit-");
		weight=sc.nextDouble();
	}
	
	public void display() {
		System.out.println("Color = "+color);
		System.out.println("Weight = "+weight);
	}
	

}
