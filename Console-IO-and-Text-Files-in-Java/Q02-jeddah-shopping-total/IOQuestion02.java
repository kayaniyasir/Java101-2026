import java.util.Scanner;

/** Q02: Jeddah Shopping Total */
public class IOQuestion02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int qty=sc.nextInt();double price=sc.nextDouble();if(qty<0||qty>100||price<0||price>10000)System.out.println("Invalid input");else System.out.printf("Total: SAR %.2f%n",qty*price);
        sc.close();
    }
}
