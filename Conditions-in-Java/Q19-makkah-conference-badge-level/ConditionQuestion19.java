import java.util.Scanner;
/** Question 19: Makkah Conference Badge Level. Focus: if-else-if. */
public class ConditionQuestion19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int years=sc.nextInt();if(years<0||years>50)System.out.println("Invalid experience");else if(years<=2)System.out.println("Beginner");else if(years<=7)System.out.println("Intermediate");else System.out.println("Expert");
        sc.close();
    }
}
