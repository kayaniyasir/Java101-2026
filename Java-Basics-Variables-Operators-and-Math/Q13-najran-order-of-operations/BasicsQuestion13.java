import java.util.Scanner;

/** Q13 — Najran Order of Operations | operator precedence */
public class BasicsQuestion13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();if(a< -100||a>100||b< -100||b>100||c< -100||c>100)System.out.println("Invalid input");else{System.out.println("Without parentheses: "+(a+b*c));System.out.println("With parentheses: "+((a+b)*c));}
        sc.close();
    }
}
