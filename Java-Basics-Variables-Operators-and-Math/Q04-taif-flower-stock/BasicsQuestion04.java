import java.util.Scanner;

/** Q04 — Taif Flower Stock | addition */
public class BasicsQuestion04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();if(a<0||b<0||a>1000||b>1000)System.out.println("Invalid quantity");else System.out.println("Flowers: "+(a+b));
        sc.close();
    }
}
