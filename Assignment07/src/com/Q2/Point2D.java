package com.Q2;


public class Point2D {
	double x;
	double y;
	
	

	public Point2D() {
		
	}
	
	
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public String getdetails() {
		return "point(" +x +","+y+")";
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public boolean isEqual(double x,double y) {
		return this.x==x && this.y==y;
	}
	public double CalculateDistance(double x,double y) {
		double dx=this.x-x;
		double dy=this.y-y;
		return Math.sqrt(dx*dx+dy*dy);
		
}


	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
	
}
