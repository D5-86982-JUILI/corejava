package com.app.fruits;

public class Orange extends Fruit{
	
	public Orange() {
		super("Orange");
	}
	
	public Orange(String color,double weight,String name) {
		super(color, weight, "Orange");
	}
	
	public String taste() {
		return "Sour";
	}

}
