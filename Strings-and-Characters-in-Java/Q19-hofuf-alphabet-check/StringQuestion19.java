import java.util.Scanner;

/** Question 19: Hofuf Alphabet Check — Character.isLetter(). */
public class StringQuestion19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String token=sc.next();if(token.length()!=1)System.out.println("Invalid input");else{char c=token.charAt(0);System.out.println((c>='A'&&c<='Z')||(c>='a'&&c<='z')?"Letter":"Not letter");}
        sc.close();
    }
}
