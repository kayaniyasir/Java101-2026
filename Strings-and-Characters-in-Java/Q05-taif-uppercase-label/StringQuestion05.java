import java.util.Scanner;

/** Question 05: Taif Uppercase Label — toUpperCase(). */
public class StringQuestion05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String label=sc.next();System.out.println(label.toUpperCase(java.util.Locale.ROOT));
        sc.close();
    }
}
