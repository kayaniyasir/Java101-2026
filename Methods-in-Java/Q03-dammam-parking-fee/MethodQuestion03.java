import java.util.Scanner;

/** Dammam Parking Fee — Java methods practice. */
public class MethodQuestion03 {
    static int fee(int hours){return hours*5;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();if(h<0||h>12)System.out.println("Invalid hours");else System.out.println("Parking fee: SAR "+fee(h));
        sc.close();
    }
}
