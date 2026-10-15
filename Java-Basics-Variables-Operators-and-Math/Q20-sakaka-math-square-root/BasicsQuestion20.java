import java.util.Scanner;

/** Q20 — Sakaka Math Square Root | Math.sqrt */
public class BasicsQuestion20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double number=sc.nextDouble();if(number<0||number>1000000)System.out.println("Invalid number");else System.out.printf("Square root: %.2f%n",Math.sqrt(number));
        sc.close();
    }
}
