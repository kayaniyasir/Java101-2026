import java.util.Scanner;

/** Q22 — Jeddah Highest Sale | Math.max */
public class BasicsQuestion22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();if(a<0||b<0||a>10000||b>10000)System.out.println("Invalid sale");else System.out.println("Higher sale: SAR "+Math.max(a,b));
        sc.close();
    }
}
