import java.util.Scanner;

/** Question 05: Abha Positive or Negative | Topic: if-else-if. */
public class ConditionQuestion05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n>0)System.out.println("Positive");else if(n<0)System.out.println("Negative");else System.out.println("Zero");
        sc.close();
    }
}
