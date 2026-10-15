import java.util.Scanner;

/** Q01 — Riyadh Student Age | int variables */
public class BasicsQuestion01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();if(age<0||age>120)System.out.println("Invalid age");else System.out.println("Age: "+age);
        sc.close();
    }
}
