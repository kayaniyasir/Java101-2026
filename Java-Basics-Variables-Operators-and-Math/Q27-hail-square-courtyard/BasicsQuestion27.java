import java.util.Scanner;

/** Q27 — Hail Square Courtyard | Math.pow */
public class BasicsQuestion27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double side=sc.nextDouble();if(side<0||side>1000)System.out.println("Invalid side");else System.out.printf("Area: %.2f m2%n",Math.pow(side,2));
        sc.close();
    }
}
