import java.util.Scanner;

/** Question 25: Yanbu Password Length — length and conditions. */
public class StringQuestion25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String password=sc.next();System.out.println(password.length()>=8&&password.length()<=16?"Valid length":"Invalid length");
        sc.close();
    }
}
