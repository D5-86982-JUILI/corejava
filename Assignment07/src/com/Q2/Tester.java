package com.Q2;


public class Tester {

    public static void main(String[] args) {
   
        try {
            Circle c1 = new Circle();
            System.out.println("Default Circle: " + c1);

            Point2D center = new Point2D(3, 4);
            Circle customCircle = new Circle(center, 50);
            System.out.println("Custom Circle: " + customCircle);

            Point2D p = new Point2D();
            customCircle.setX(5);
            customCircle.setY(6);
            customCircle.setmyDiameter(60);
            System.out.println("Updated Custom Circle: " + customCircle);
            customCircle.setmyDiameter(-10);
          
        } catch (ExceptionDiameterNegative e) {
            e.printStackTrace();
        }
        
    }
}



