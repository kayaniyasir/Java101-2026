/**
 * Basic Loops in Java — Question 03
 * Dammam Parking Menu
 * Main topic: do-while
 * Dammam Parking Menu
 * Sample input: 1 | 2 | 0
 * Expected output: Parking information | Fees depend on duration | Goodbye
 */
import java.util.Scanner;

public class LoopQuestion03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;do{choice=sc.nextInt();switch(choice){case 1:System.out.println("Parking information");break;case 2:System.out.println("Fees depend on duration");break;case 0:System.out.println("Goodbye");break;default:System.out.println("Invalid choice");}}while(choice!=0);
        sc.close();
    }
}
