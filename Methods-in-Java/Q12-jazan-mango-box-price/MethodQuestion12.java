import java.util.Scanner;

/** Jazan Mango Box Price — Java methods practice. */
public class MethodQuestion12 {
    static double calculateTotal(int count,double price){return count*price;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=sc.nextInt();double p=sc.nextDouble();if(c<0||c>100||p<0||p>1000)System.out.println("Invalid input");else System.out.printf("Total: SAR %.2f%n",calculateTotal(c,p));
        sc.close();
    }
}
