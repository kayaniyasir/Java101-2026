import java.util.Scanner;

/** Al Khobar Hotel Nights — Java methods practice. */
public class MethodQuestion24 {
    static double stayCost(int nights){return nights*220.0;}
    static double stayCost(int nights,double discountRate){return stayCost(nights)*(1-discountRate/100);}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();double d=sc.nextDouble();if(n<1||n>30||d<0||d>100)System.out.println("Invalid input");else{System.out.printf("Base: SAR %.2f%n",stayCost(n));System.out.printf("Discounted: SAR %.2f%n",stayCost(n,d));}
        sc.close();
    }
}
