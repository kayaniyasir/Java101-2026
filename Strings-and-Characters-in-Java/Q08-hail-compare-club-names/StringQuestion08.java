import java.util.Scanner;

/** Question 08: Hail Compare Club Names — equals(). */
public class StringQuestion08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next(),b=sc.next();System.out.println(a.equals(b)?"Same":"Different");
        sc.close();
    }
}
