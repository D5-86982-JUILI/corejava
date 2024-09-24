package Menu;
import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalBill = 0;
        int price = 0;

        while (true) {
            System.out.println("Food Menu:");
            System.out.println("1. Dosa - Rs 50");
            System.out.println("2. Samosa - Rs 15");
            System.out.println("3. Idli - Rs 30");
            System.out.println("4. Vada - Rs 20");
            System.out.println("5. Pav Bhaji - Rs 60");
            System.out.println("6. Biryani - Rs 100");
            System.out.println("7. Chole Bhature - Rs 80");
            System.out.println("8. Paneer Tikka - Rs 120");
            System.out.println("9. Masala Chai - Rs 10");
            System.out.println("10. Generate Bill");

          
            System.out.print("Please select an item by number (or choose 10 to Generate Bill): ");
            int choice = scanner.nextInt();

         
            switch (choice) {
                case 1:
                    price = 50;
                    break;
                case 2:
                    price = 15;
                    break;
                case 3:
                    price = 30;
                    break;
                case 4:
                    price = 20;
                    break;
                case 5:
                    price = 60;
                    break;
                case 6:
                    price = 100;
                    break;
                case 7:
                    price = 80;
                    break;
                case 8:
                    price = 120;
                    break;
                case 9:
                    price = 10;
                    break;
                case 10:
                    System.out.println("Total Bill: Rs " + totalBill);
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid item.");
                    continue; 
            }

            
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            totalBill += price * quantity;
        }
    }
}