import java.util.Scanner;

/** Question 13: Jazan Event Suffix — endsWith(). */
public class StringQuestion13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String id=sc.next();System.out.println(id.endsWith("-OK")?"Approved":"Not approved");
        sc.close();
    }
}
