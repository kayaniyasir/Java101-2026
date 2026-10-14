import java.util.Scanner;

/** Question 10: Madinah Bookshop Discount | Topic: nested if. */
public class ConditionQuestion10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill=sc.nextDouble();int student=sc.nextInt();if(bill<0||bill>10000||(student!=0&&student!=1))System.out.println("Invalid input");else{if(student==1){if(bill>=50)System.out.println("Discount granted");else System.out.println("No discount");}else System.out.println("No discount");}
        sc.close();
    }
}
