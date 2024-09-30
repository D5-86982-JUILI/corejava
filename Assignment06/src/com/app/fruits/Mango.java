package com.app.fruits;

public class Mango extends Fruit{
	
	public Mango() {
		super("Mango");
	}
	
	public Mango(String color,double weight,String name) {
		super(color, weight, "Mango");
	}
	
	public String taste() {
		return "Sweet";
	}

}
