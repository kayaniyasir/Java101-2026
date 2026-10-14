/**
 * Basic Loops in Java — Question 06
 * Taif Fruit Basket Pattern
 * Main topic: nested for
 * Taif Fruit Basket Pattern
 * Sample input: 4
 * Expected output: * | ** | *** | ****
 */
import java.util.Scanner;

public class LoopQuestion06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();if(rows<1||rows>6)System.out.println("Invalid rows");else for(int i=1;i<=rows;i++){for(int j=1;j<=i;j++)System.out.print("*");System.out.println();}
        sc.close();
    }
}
