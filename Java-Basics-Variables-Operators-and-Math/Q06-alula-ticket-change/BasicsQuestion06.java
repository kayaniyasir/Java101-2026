import java.util.Scanner;

/** Q06 — AlUla Ticket Change | subtraction */
public class BasicsQuestion06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double cash=sc.nextDouble(),price=sc.nextDouble();if(cash<0||cash>1000||price<0||price>1000||cash<price)System.out.println("Invalid payment");else System.out.printf("Change: SAR %.2f%n",cash-price);
        sc.close();
    }
}
