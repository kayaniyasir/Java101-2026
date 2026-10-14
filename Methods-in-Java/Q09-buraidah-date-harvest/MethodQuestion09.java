import java.util.Scanner;

/** Buraidah Date Harvest — Java methods practice. */
public class MethodQuestion09 {
    static double saleValue(double kg){return kg*12.5;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kg=sc.nextDouble();if(kg<0||kg>10000)System.out.println("Invalid weight");else System.out.printf("Value: SAR %.2f%n",saleValue(kg));
        sc.close();
    }
}
