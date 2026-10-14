import java.util.Scanner;

/** Question 12: Tabuk Registration Prefix — startsWith(). */
public class StringQuestion12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String code=sc.next();System.out.println(code.startsWith("TB")?"Valid prefix":"Invalid prefix");
        sc.close();
    }
}
