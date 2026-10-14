import java.util.Scanner;
/** Conditions in Java — Question 26: Riyadh Number Divisibility. */
public class ConditionQuestion26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n%3==0&&n%5==0)System.out.println("Divisible by both");else System.out.println("Not divisible by both");
        sc.close();
    }
}
