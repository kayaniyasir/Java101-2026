/**
 * Basic Loops in Java - Question 10: Hail Sports Check-In
 * Focus: do-while
 * Sample input: 11 | 15 | 0
 * Expected: Participants: 2
 */
import java.util.Scanner;

public class LoopQuestion10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=0,age;boolean valid=true;do{age=sc.nextInt();if(age==0)break;if(age<6||age>18){valid=false;break;}total++;}while(true);if(!valid)System.out.println("Invalid age");else System.out.println("Participants: "+total);
        sc.close();
    }
}
