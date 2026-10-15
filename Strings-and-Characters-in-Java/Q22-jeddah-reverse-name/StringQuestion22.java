import java.util.Scanner;

/** Question 22: Jeddah Reverse Name — reverse with loop. */
public class StringQuestion22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();String reversed="";for(int i=name.length()-1;i>=0;i--)reversed+=name.charAt(i);System.out.println(reversed);
        sc.close();
    }
}
