import java.util.Scanner;

/** Q25 — Abha Hotel Nights | Math.ceil */
public class BasicsQuestion25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double nights=sc.nextDouble();if(nights<0||nights>100)System.out.println("Invalid nights");else System.out.println("Billable nights: "+(int)Math.ceil(nights));
        sc.close();
    }
}
