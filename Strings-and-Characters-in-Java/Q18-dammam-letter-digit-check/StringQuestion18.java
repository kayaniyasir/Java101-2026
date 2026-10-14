import java.util.Scanner;

/** Question 18: Dammam Letter Digit Check — Character.isDigit(). */
public class StringQuestion18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String token=sc.next();if(token.length()!=1)System.out.println("Invalid input");else System.out.println(Character.isDigit(token.charAt(0))?"Digit":"Not digit");
        sc.close();
    }
}
