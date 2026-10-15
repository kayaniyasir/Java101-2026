import java.util.Scanner;

/** Q15 — Diriyah Remaining Seats | decrement operator */
public class BasicsQuestion15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int seats=sc.nextInt();if(seats<1||seats>500)System.out.println("Invalid seats");else{seats--;System.out.println("Remaining seats: "+seats);}
        sc.close();
    }
}
