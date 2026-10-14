import java.util.Scanner;

/** Question 16: Al Bahah Replace Separators — replace(). */
public class StringQuestion16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String route=sc.next();System.out.println(route.replace('-','_'));
        sc.close();
    }
}
