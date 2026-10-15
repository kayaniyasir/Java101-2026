import java.util.Scanner;

/** Question 24: Abha Count Digits — Character.isDigit with loop. */
public class StringQuestion24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String code=sc.next();int count=0;for(int i=0;i<code.length();i++)if(Character.isDigit(code.charAt(i)))count++;System.out.println("Digits: "+count);
        sc.close();
    }
}
