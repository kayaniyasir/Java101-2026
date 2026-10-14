import java.util.Scanner;

/** AlUla Ticket Discount — Java methods practice. */
public class MethodQuestion06 {
    static double ticketPrice(int age){return age<12?20.0:40.0;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();if(age<0||age>120)System.out.println("Invalid age");else System.out.printf("Ticket: SAR %.2f%n",ticketPrice(age));
        sc.close();
    }
}
