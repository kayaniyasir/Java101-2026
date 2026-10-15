import java.util.Scanner;

/** Q08: Yanbu Event Identifier */
public class IOQuestion08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String token=sc.next();if(token.length()!=1)System.out.println("Invalid code");else{char c=Character.toUpperCase(token.charAt(0));if(c=='W')System.out.println("Workshop");else if(c=='C')System.out.println("Competition");else System.out.println("Unknown event");}
        sc.close();
    }
}
