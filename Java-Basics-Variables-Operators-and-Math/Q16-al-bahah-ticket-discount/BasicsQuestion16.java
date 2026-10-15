import java.util.Scanner;

/** Q16 — Al Bahah Ticket Discount | compound assignment */
public class BasicsQuestion16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double price=sc.nextDouble();if(price<10||price>1000)System.out.println("Invalid price");else{price-=10;System.out.printf("Discounted: SAR %.2f%n",price);}
        sc.close();
    }
}
