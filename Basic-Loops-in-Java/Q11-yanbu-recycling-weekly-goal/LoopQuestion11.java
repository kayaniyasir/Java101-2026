/**
 * Basic Loops in Java - Question 11: Yanbu Recycling Weekly Goal
 * Focus: for
 * Sample input: 10 15 20 10 15 20 10
 * Expected: Total: 100 | Goal reached
 */
import java.util.Scanner;

public class LoopQuestion11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=0;boolean valid=true;for(int d=1;d<=7;d++){int n=sc.nextInt();if(n<0)valid=false;else total+=n;}if(!valid)System.out.println("Invalid count");else{System.out.println("Total: "+total);System.out.println(total>=100?"Goal reached":"Goal not reached");}
        sc.close();
    }
}
