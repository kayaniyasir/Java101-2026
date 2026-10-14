import java.util.Scanner;

/** Question 14: Jubail Extract Prefix — substring(). */
public class StringQuestion14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String code=sc.next();if(code.length()<3)System.out.println("Invalid code");else System.out.println("Prefix: "+code.substring(0,3));
        sc.close();
    }
}
