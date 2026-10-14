import java.util.Scanner;

/** Riyadh Shopping Price Overload — Java methods practice. */
public class MethodQuestion28 {
    static double priceAfterDiscount(int price){return price*.9;}
    static double priceAfterDiscount(double price){return price*.9;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();double b=sc.nextDouble();if(a<0||a>10000||b<0||b>10000)System.out.println("Invalid price");else{System.out.printf("Whole-price item: SAR %.2f%n",priceAfterDiscount(a));System.out.printf("Decimal-price item: SAR %.2f%n",priceAfterDiscount(b));}
        sc.close();
    }
}
