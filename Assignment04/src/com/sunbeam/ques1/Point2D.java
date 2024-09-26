package com.sunbeam.ques1;



public class Point2D {
	double x;
	double y;
	

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public String getDetails() {
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
	public boolean isEqual(Point2D point2d) {
		return this.x==point2d.x && this.y==point2d.y;
	
	}
	public double CalculateDistance(Point2D point2d) {
		return Math.sqrt(Math.pow(point2d.x-this.x, 2)+Math.pow(point2d.y-this.y, 2));
		
	}}
