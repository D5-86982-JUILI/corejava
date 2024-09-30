package com.app.fruits;

public class Apple extends Fruit {
	
	public Apple() {
		super("Apple");
	}
	
	public Apple(String color,double weight,String name) {
		super(color, weight,"Apple");
	}
	
	public String taste() {
		return "Sweet n sour";
	}

}
