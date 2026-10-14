import java.util.Scanner;

/** Question 04: Abha Last Character — charAt and length. */
public class StringQuestion04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String route=sc.next();System.out.println("Last: "+route.charAt(route.length()-1));
        sc.close();
    }
}
