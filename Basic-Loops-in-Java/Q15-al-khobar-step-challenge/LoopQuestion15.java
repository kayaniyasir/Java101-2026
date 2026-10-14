/**
 * Basic Loops in Java - Question 15: Al Khobar Step Challenge
 * Focus: while
 * Sample input: 4000 | 5000 | 0
 * Expected: Days: 2 | Steps: 9000
 */
import java.util.Scanner;

public class LoopQuestion15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days=0,total=0,n=sc.nextInt();boolean valid=true;while(n!=0){if(n<0){valid=false;break;}days++;total+=n;n=sc.nextInt();}if(!valid)System.out.println("Invalid steps");else{System.out.println("Days: "+days);System.out.println("Steps: "+total);}
        sc.close();
    }
}
