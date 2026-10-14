import java.util.Scanner;

/** Al Bahah Hiking Distance — Java methods practice. */
public class MethodQuestion16 {
    static double distance(double hours,double speed){return hours*speed;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h=sc.nextDouble(),speed=sc.nextDouble();if(h<0||h>24||speed<0||speed>10)System.out.println("Invalid input");else System.out.printf("Distance: %.1f km%n",distance(h,speed));
        sc.close();
    }
}
