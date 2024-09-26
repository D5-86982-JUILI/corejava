package tester;
import java.util.Scanner;
import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 cordinates = ");
		double x1 = sc.nextDouble();
		System.out.println("Enter y1 cordinates = ");
		double y1=sc.nextDouble();
		Point2D p1= new Point2D(x1,y1);
		
		System.out.println("Enter x2 cordinates =  ");
		double x2=sc.nextDouble();
		System.out.println("Enter y2 cordinates = ");
		double y2 = sc.nextDouble();
		Point2D p2 = new Point2D(x2,y2);
		
		
		System.out.println("Point 1 = "+p1.getdetails());
		System.out.println("Point 2 = "+p2.getdetails());
		
		if (p1.isEqual(x2,y2)) {
			System.out.println("Points are equal ");
		}
		else {
			double distance = p1.CalculateDistance(x2, y2);
			System.out.println("Points are not equal");
			System.out.println("Distance between two points is = "+distance);
		}
		
		

	}

}
