import java.util.Scanner;

/** Q29 — Buraidah Combine Measurements | Math.hypot */
public class BasicsQuestion29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble(),b=sc.nextDouble();if(a<0||b<0||a>10000||b>10000)System.out.println("Invalid distance");else System.out.printf("Straight distance: %.2f km%n",Math.hypot(a,b));
        sc.close();
    }
}
