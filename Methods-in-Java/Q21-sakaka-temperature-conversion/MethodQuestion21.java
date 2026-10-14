import java.util.Scanner;

/** Sakaka Temperature Conversion — Java methods practice. */
public class MethodQuestion21 {
    static double toFahrenheit(double c){return c*9.0/5+32;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c=sc.nextDouble();System.out.printf("Fahrenheit: %.1f%n",toFahrenheit(c));
        sc.close();
    }
}
