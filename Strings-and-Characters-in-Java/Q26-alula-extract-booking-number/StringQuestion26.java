import java.util.Scanner;

/** Question 26: AlUla Extract Booking Number — substring and indexOf. */
public class StringQuestion26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String code=sc.next();int dash=code.indexOf('-');if(dash<0||dash==code.length()-1)System.out.println("Invalid code");else System.out.println("Booking: "+code.substring(dash+1));
        sc.close();
    }
}
