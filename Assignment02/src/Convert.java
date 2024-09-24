import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = Scanner.nextInt();
        System.out.println("Given Number: " + number);
        String binaryString = Integer.toBinaryString(number);
        String octalString = Integer.toOctalString(number);
        String hexString = Integer.toHexString(number);
        System.out.println("Binary equivalent: " + binaryString);
        System.out.println("Octal equivalent: " + octalString);
        System.out.println("Hexadecimal equivalent: " + hexString.toUpperCase());
        
      
    }
}
