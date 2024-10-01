package com.Q2;

import java.util.Scanner;

public class Circle {
	private Point2D centre;
	private double myDiameter;
	
	
	
	public Circle() {
		super();
		this.centre=new Point2D(0,0);
		this.myDiameter=100;
		
	}



	public Circle(Point2D point, double mydiameter) {
		super();
		this.centre = point;
		setmyDiameter(mydiameter);
	}



	public Point2D getCentre() {
		return centre;
	}



	public void setCentre(Point2D centre) {
		this.centre = centre;
	}




	public double getmyDiameter() {
		return myDiameter;
	}



	public void setmyDiameter(double mydiameter) {
		myDiameter = mydiameter;
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter two cordinates x and y");
		centre.x = sc.nextInt();
		centre.y=sc.nextInt();
		System.out.println("Enter Diameter - ");
		myDiameter=sc.nextDouble();
	}



	public void setX(int i) {
		this.centre.x=i;
		
	}



	public void setY(int j) {
		this.centre.y=j;
		
	}



	@Override
	public String toString() {
		return "Circle [centre=" + centre + ", myDiameter=" + myDiameter + "]";
	}
	
	
	
	
	

}
