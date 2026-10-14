/**
 * Basic Loops in Java - Question 13: Riyadh Metro Token Guess
 * Focus: while + break
 * Sample input: 3 | 7
 * Expected: Correct!
 */
import java.util.Scanner;

public class LoopQuestion13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempts=0;boolean found=false;while(attempts<5){int guess=sc.nextInt();attempts++;if(guess==7){found=true;break;}}System.out.println(found?"Correct!":"No more attempts");
        sc.close();
    }
}
