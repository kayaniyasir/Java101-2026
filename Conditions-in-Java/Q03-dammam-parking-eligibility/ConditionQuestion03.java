import java.util.Scanner;

/** Question 03: Dammam Parking Eligibility | Topic: if-else. */
public class ConditionQuestion03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();if(age<0||age>120)System.out.println("Invalid age");else System.out.println(age>=60?"Senior rate":"Standard rate");
        sc.close();
    }
}
