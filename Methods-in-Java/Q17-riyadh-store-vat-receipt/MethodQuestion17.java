import java.util.Scanner;

/** Riyadh Store VAT Receipt — Java methods practice. */
public class MethodQuestion17 {
    static double vat(double amount){return amount*.15;}
    static double grandTotal(double amount){return amount+vat(amount);}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value=sc.nextDouble();if(value<0||value>100000)System.out.println("Invalid subtotal");else System.out.printf("Total with VAT: SAR %.2f%n",grandTotal(value));
        sc.close();
    }
}
