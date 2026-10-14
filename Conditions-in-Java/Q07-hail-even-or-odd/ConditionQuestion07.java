import java.util.Scanner;

/** Question 07: Hail Even or Odd | Topic: modulo with if-else. */
public class ConditionQuestion07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n%2==0)System.out.println("Even");else System.out.println("Odd");
        sc.close();
    }
}
