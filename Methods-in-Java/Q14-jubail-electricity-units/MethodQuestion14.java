import java.util.Scanner;

/** Jubail Electricity Units — Java methods practice. */
public class MethodQuestion14 {
    static double bill(int units){if(units<=100)return units*.20;return 20.0+(units-100)*.30;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u=sc.nextInt();if(u<0||u>10000)System.out.println("Invalid units");else System.out.printf("Bill: SAR %.2f%n",bill(u));
        sc.close();
    }
}
