/**
 * Basic Loops in Java — Question 01
 * Riyadh Shopping Total
 * Main topic: for
 * Riyadh Shopping Total
 * Sample input: 3
 * Expected output: Total: SAR 18
 */
import java.util.Scanner;

public class LoopQuestion01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<0||n>30){System.out.println("Invalid quantity");}else{int sum=0;for(int i=0;i<n;i++)sum+=6;System.out.println("Total: SAR "+sum);}
        sc.close();
    }
}
