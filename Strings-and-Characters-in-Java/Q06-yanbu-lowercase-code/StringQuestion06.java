import java.util.Scanner;

/** Question 06: Yanbu Lowercase Code — toLowerCase(). */
public class StringQuestion06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String code=sc.next();System.out.println(code.toLowerCase(java.util.Locale.ROOT));
        sc.close();
    }
}
