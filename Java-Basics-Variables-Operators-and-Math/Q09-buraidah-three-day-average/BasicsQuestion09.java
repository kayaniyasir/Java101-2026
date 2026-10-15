import java.util.Scanner;

/** Q09 — Buraidah Three-Day Average | floating point division */
public class BasicsQuestion09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();if(a<0||b<0||c<0||a>10000||b>10000||c>10000)System.out.println("Invalid sales");else System.out.printf("Average: %.2f%n",(a+b+c)/3.0);
        sc.close();
    }
}
