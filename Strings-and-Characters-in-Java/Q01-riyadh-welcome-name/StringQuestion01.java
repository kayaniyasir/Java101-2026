import java.util.Scanner;

/** Question 01: Riyadh Welcome Name — String input. */
public class StringQuestion01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();System.out.println("Welcome to Riyadh, "+name+"!");
        sc.close();
    }
}
