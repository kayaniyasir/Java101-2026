/**
 * Basic Loops in Java — Question 04
 * Abha Daily Temperatures
 * Main topic: for
 * Abha Daily Temperatures
 * Sample input: 3 | 18 | 21 | 24
 * Expected output: Average: 21.0 C
 */
import java.util.Scanner;

public class LoopQuestion04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days=sc.nextInt();if(days<1||days>7)System.out.println("Invalid days");else{double total=0;for(int d=1;d<=days;d++)total+=sc.nextDouble();System.out.printf("Average: %.1f C%n",total/days);}
        sc.close();
    }
}
