import java.util.Scanner;

/** Taif Flower Order — Java methods practice. */
public class MethodQuestion26 {
    static int bouquetCost(int qty){return qty*25;}
    static int deliveryFee(){return 10;}
    static int totalCost(int qty){return bouquetCost(qty)+deliveryFee();}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<0||n>50)System.out.println("Invalid quantity");else System.out.println("Order total: SAR "+totalCost(n));
        sc.close();
    }
}
