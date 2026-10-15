import java.util.Scanner;

/** Q10 — Madinah Room Area | arithmetic expression */
public class BasicsQuestion10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double length=sc.nextDouble(),width=sc.nextDouble();if(length<=0||width<=0||length>100||width>100)System.out.println("Invalid dimension");else System.out.printf("Area: %.2f m2%n",length*width);
        sc.close();
    }
}
