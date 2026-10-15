import java.util.Scanner;

/** Q02 — Jeddah Fuel Price | double variables */
public class BasicsQuestion02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double price=sc.nextDouble();if(price<0||price>100)System.out.println("Invalid price");else System.out.printf("Price: SAR %.2f%n",price);
        sc.close();
    }
}
