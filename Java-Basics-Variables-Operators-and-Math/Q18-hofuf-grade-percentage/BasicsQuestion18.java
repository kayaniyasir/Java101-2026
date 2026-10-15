import java.util.Scanner;

/** Q18 — Hofuf Grade Percentage | type conversion */
public class BasicsQuestion18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int earned=sc.nextInt(),maximum=sc.nextInt();if(maximum<1||maximum>1000||earned<0||earned>maximum)System.out.println("Invalid marks");else System.out.printf("Percentage: %.1f%%%n",100.0*earned/maximum);
        sc.close();
    }
}
