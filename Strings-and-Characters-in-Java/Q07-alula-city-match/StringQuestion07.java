import java.util.Scanner;

/** Question 07: AlUla City Match — equalsIgnoreCase(). */
public class StringQuestion07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String city=sc.next();System.out.println(city.equalsIgnoreCase("AlUla")?"Match":"No match");
        sc.close();
    }
}
