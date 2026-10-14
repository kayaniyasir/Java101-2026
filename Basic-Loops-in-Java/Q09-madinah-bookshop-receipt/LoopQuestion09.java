/**
 * Basic Loops in Java — Question 09
 * Madinah Bookshop Receipt
 * Main topic: while
 * Madinah Bookshop Receipt
 * Sample input: 6
 * Expected output: Bill: SAR 24
 */
import java.util.Scanner;

public class LoopQuestion09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<0||n>20)System.out.println("Invalid quantity");else{int bill=0,i=0;while(i<n){bill+=4;i++;}System.out.println("Bill: SAR "+bill);}
        sc.close();
    }
}
