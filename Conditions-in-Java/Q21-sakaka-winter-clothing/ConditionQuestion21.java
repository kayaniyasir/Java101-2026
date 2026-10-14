import java.util.Scanner;
/** Conditions in Java — Question 21: Sakaka Winter Clothing. */
public class ConditionQuestion21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();if(t < -20||t>55)System.out.println("Invalid temperature");else if(t<10)System.out.println("Jacket");else if(t<=24)System.out.println("Sweater");else System.out.println("Light clothes");
        sc.close();
    }
}
