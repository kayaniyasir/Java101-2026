import java.util.Scanner;

/** Q17 — Riyadh VAT Calculator | named constant */
public class BasicsQuestion17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        final double VAT_RATE=0.15;double subtotal=sc.nextDouble();if(subtotal<0||subtotal>100000)System.out.println("Invalid subtotal");else{double vat=subtotal*VAT_RATE;System.out.printf("VAT: SAR %.2f%n",vat);System.out.printf("Total: SAR %.2f%n",subtotal+vat);}
        sc.close();
    }
}
