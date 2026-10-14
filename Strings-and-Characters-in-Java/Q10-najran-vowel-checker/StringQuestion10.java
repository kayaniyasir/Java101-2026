import java.util.Scanner;

/** Question 10: Najran Vowel Checker — Character and if. */
public class StringQuestion10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String token=sc.next();if(token.length()!=1||!Character.isLetter(token.charAt(0))||token.charAt(0)>127)System.out.println("Invalid letter");else{char c=Character.toLowerCase(token.charAt(0));System.out.println(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'?"Vowel":"Consonant");}
        sc.close();
    }
}
