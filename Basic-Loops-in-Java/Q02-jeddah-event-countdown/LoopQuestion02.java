/**
 * Basic Loops in Java — Question 02
 * Jeddah Event Countdown
 * Main topic: while
 * Jeddah Event Countdown
 * Sample input: 3
 * Expected output: 3 | 2 | 1 | START
 */
import java.util.Scanner;

public class LoopQuestion02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>10)System.out.println("Invalid countdown");else{while(n>=1){System.out.println(n);n--;}System.out.println("START");}
        sc.close();
    }
}
