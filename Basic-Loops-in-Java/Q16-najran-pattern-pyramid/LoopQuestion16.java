/**
 * Basic Loops in Java - Question 16: Najran Pattern Pyramid
 * Focus: nested for
 * Sample input: 3
 * Expected:   # |  ## | ###
 */
import java.util.Scanner;

public class LoopQuestion16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>5)System.out.println("Invalid height");else for(int row=1;row<=n;row++){for(int spaces=0;spaces<n-row;spaces++)System.out.print(" ");for(int k=0;k<row;k++)System.out.print("#");System.out.println();}
        sc.close();
    }
}
