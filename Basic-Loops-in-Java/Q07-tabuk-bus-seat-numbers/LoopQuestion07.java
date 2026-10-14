/**
 * Basic Loops in Java — Question 07
 * Tabuk Bus Seat Numbers
 * Main topic: for + continue
 * Tabuk Bus Seat Numbers
 * Sample input: 12
 * Expected output: 1 2 3 4 6 7 8 9 11 12
 */
import java.util.Scanner;

public class LoopQuestion07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>30)System.out.println("Invalid limit");else{boolean first=true;for(int i=1;i<=n;i++){if(i%5==0)continue;if(!first)System.out.print(" ");System.out.print(i);first=false;}System.out.println();}
        sc.close();
    }
}
