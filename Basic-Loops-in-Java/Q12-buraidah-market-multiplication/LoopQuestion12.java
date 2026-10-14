/**
 * Basic Loops in Java - Question 12: Buraidah Market Multiplication
 * Focus: for
 * Sample input: 3
 * Expected: 3 x 1 = 3 | 3 x 2 = 6 | 3 x 3 = 9 | 3 x 4 = 12 | 3 x 5 = 15
 */
import java.util.Scanner;

public class LoopQuestion12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>12)System.out.println("Invalid number");else for(int i=1;i<=5;i++)System.out.println(n+" x "+i+" = "+(n*i));
        sc.close();
    }
}
