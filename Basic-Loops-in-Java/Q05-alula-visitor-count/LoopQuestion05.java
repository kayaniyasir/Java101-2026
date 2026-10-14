/**
 * Basic Loops in Java — Question 05
 * AlUla Visitor Count
 * Main topic: while
 * AlUla Visitor Count
 * Sample input: 5 | 7 | 8 | 0
 * Expected output: Total visitors: 20
 */
import java.util.Scanner;

public class LoopQuestion05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=0,n=sc.nextInt();boolean valid=true;while(n!=0){if(n<0){valid=false;break;}total+=n;n=sc.nextInt();}if(!valid)System.out.println("Invalid count");else System.out.println("Total visitors: "+total);
        sc.close();
    }
}
