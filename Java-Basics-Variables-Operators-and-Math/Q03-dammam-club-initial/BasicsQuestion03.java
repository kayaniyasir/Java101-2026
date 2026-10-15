import java.util.Scanner;

/** Q03 — Dammam Club Initial | char and charAt */
public class BasicsQuestion03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();if(input.length()!=1)System.out.println("Invalid code");else{char code=input.charAt(0);System.out.println("Club: "+code);}
        sc.close();
    }
}
