import java.util.Scanner;

/** Q21 — Riyadh Round Trip Distance | Math.abs */
public class BasicsQuestion21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int distance=sc.nextInt();if(distance< -10000||distance>10000)System.out.println("Invalid distance");else System.out.println("Distance magnitude: "+Math.abs(distance)+" km");
        sc.close();
    }
}
