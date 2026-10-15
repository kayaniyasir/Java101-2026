import java.util.Scanner;

/** Q19 — Makkah Conference Clock | division and remainder */
public class BasicsQuestion19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int minutes=sc.nextInt();if(minutes<0||minutes>1439)System.out.println("Invalid minutes");else System.out.println("Time: "+(minutes/60)+" hours "+(minutes%60)+" minutes");
        sc.close();
    }
}
