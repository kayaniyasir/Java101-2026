import java.util.Scanner;

/** Q28 — Yanbu Circle Garden | Math.PI */
public class BasicsQuestion28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();if(r<0||r>1000)System.out.println("Invalid radius");else System.out.printf("Area: %.2f m2%n",Math.PI*r*r);
        sc.close();
    }
}
