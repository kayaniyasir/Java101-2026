import java.util.Scanner;

/** Question 11: Madinah Book Title Search — contains(). */
public class StringQuestion11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String title=sc.next();System.out.println(title.toLowerCase(java.util.Locale.ROOT).contains("java")?"Java found":"Java not found");
        sc.close();
    }
}
