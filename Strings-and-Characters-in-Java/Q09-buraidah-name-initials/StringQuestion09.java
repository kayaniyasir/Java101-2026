import java.util.Scanner;

/** Question 09: Buraidah Name Initials — charAt(). */
public class StringQuestion09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next(),b=sc.next();System.out.println(""+Character.toUpperCase(a.charAt(0))+"."+Character.toUpperCase(b.charAt(0)));
        sc.close();
    }
}
