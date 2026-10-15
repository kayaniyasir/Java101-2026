import java.util.Scanner;

/** Q12: Jazan Mango Order VAT */
public class IOQuestion12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double subtotal=sc.nextDouble();if(subtotal<0||subtotal>100000)System.out.println("Invalid subtotal");else{System.out.printf("VAT: SAR %.2f%n",subtotal*.15);System.out.printf("Total: SAR %.2f%n",subtotal*1.15);}
        sc.close();
    }
}
