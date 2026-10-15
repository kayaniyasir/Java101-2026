import java.util.Scanner;

/** Q05 — Abha Trip Cost | multiplication */
public class BasicsQuestion05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int passengers=sc.nextInt();double fare=sc.nextDouble();if(passengers<0||passengers>50||fare<0||fare>1000)System.out.println("Invalid input");else System.out.printf("Total: SAR %.2f%n",passengers*fare);
        sc.close();
    }
}
