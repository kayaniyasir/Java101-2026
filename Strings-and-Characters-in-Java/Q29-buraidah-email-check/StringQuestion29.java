import java.util.Scanner;

/** Question 29: Buraidah Email Check — contains and indexOf. */
public class StringQuestion29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String email=sc.next();int at=email.indexOf('@');int lastAt=email.lastIndexOf('@');int dot=email.lastIndexOf('.');boolean ok=at>0&&at==lastAt&&dot>at+1&&dot<email.length()-1;System.out.println(ok?"Valid format":"Invalid format");
        sc.close();
    }
}
