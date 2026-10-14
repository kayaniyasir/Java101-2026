import java.util.Scanner;

/** Question 20: Sakaka Compare City Codes — compareTo(). */
public class StringQuestion20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next(),b=sc.next();int comparison=a.compareTo(b);System.out.println(comparison<0?"First code comes first":comparison>0?"Second code comes first":"Equal codes");
        sc.close();
    }
}
