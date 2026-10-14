import java.util.Scanner;

/** Question 02: Jeddah Temperature Alert | Topic: simple if. */
public class ConditionQuestion02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();if(t < -10||t>60)System.out.println("Invalid temperature");else{System.out.println("Temperature recorded");if(t>=40)System.out.println("Heat alert");}
        sc.close();
    }
}
