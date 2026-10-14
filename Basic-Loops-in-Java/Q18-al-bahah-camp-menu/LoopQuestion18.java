/**
 * Basic Loops in Java - Question 18: Al Bahah Camp Menu
 * Focus: do-while
 * Sample input: 2 | 3 | 0
 * Expected: Camping | Safety briefing | Goodbye
 */
import java.util.Scanner;

public class LoopQuestion18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;do{option=sc.nextInt();switch(option){case 1:System.out.println("Hiking");break;case 2:System.out.println("Camping");break;case 3:System.out.println("Safety briefing");break;case 0:System.out.println("Goodbye");break;default:System.out.println("Invalid choice");}}while(option!=0);
        sc.close();
    }
}
