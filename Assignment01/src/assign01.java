import java.util.Scanner;

public class assign01 {

    public static void main(String[] args) {
        System.out.println("Enter any double value");
        Scanner sc = new Scanner(System.in);
        double x,y;

        if (sc.hasNextDouble()) {
             x = sc.nextDouble();
            System.out.println("Your Double value is=" + x);
           
        } else {
            System.out.println("Enter valid double value");
            return;
 
        }
        if (sc.hasNextDouble()) {
             y = sc.nextDouble();
            System.out.println("Your Double value is=" + y);
      
        } else {
            System.out.println("Enter valid double value");
            return;
        
        }
        
        System.out.println("Average = "+(x+y)/2);
       
    }
    
}
