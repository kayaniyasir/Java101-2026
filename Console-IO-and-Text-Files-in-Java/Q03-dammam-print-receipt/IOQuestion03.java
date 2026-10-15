import java.util.Scanner;

/** Q03: Dammam Print Receipt */
public class IOQuestion03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String item=sc.next();int qty=sc.nextInt();double price=sc.nextDouble();if(qty<0||qty>100||price<0||price>10000)System.out.println("Invalid input");else{System.out.println("Item: "+item);System.out.println("Quantity: "+qty);System.out.printf("Amount: SAR %.2f%n",qty*price);}
        sc.close();
    }
}
