import java.util.Scanner;

/** Question 08: Yanbu Free Delivery | Topic: logical AND. */
public class ConditionQuestion08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount=sc.nextDouble();int member=sc.nextInt();if(amount<0||amount>10000||(member!=0&&member!=1))System.out.println("Invalid input");else if(amount>=100&&member==1)System.out.println("Free delivery");else System.out.println("Delivery fee applies");
        sc.close();
    }
}
