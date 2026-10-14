import java.util.Scanner;
/** Question 18: Hofuf Date Purchase VAT. Focus: if-else. */
public class ConditionQuestion18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double subtotal=sc.nextDouble();if(subtotal<0||subtotal>10000)System.out.println("Invalid amount");else{double afterDiscount;if(subtotal>=100)afterDiscount=subtotal-10;else afterDiscount=subtotal;double total=afterDiscount*1.15;System.out.printf("Total: SAR %.2f%n",total);}
        sc.close();
    }
}
