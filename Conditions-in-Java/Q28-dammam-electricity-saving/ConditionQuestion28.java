import java.util.Scanner;
/** Conditions in Java — Question 28: Dammam Electricity Saving. */
public class ConditionQuestion28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units=sc.nextInt();if(units<0||units>5000)System.out.println("Invalid units");else if(units<=200)System.out.println("Saving");else System.out.println("High usage");
        sc.close();
    }
}
