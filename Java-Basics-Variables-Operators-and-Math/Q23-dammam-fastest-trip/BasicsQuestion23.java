import java.util.Scanner;

/** Q23 — Dammam Fastest Trip | Math.min */
public class BasicsQuestion23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();if(a<1||b<1||a>10000||b>10000)System.out.println("Invalid time");else System.out.println("Shorter trip: "+Math.min(a,b)+" minutes");
        sc.close();
    }
}
