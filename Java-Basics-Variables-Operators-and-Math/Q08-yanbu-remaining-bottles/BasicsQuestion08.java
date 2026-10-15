import java.util.Scanner;

/** Q08 — Yanbu Remaining Bottles | remainder operator */
public class BasicsQuestion08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bottles=sc.nextInt();if(bottles<0||bottles>1000)System.out.println("Invalid bottles");else System.out.println("Remaining: "+(bottles%6));
        sc.close();
    }
}
