import java.util.Scanner;

/** Q11 — Tabuk Celsius Conversion | arithmetic and double */
public class BasicsQuestion11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double c=sc.nextDouble();if(c< -50||c>70)System.out.println("Invalid temperature");else System.out.printf("Fahrenheit: %.1f%n",c*9.0/5+32);
        sc.close();
    }
}
