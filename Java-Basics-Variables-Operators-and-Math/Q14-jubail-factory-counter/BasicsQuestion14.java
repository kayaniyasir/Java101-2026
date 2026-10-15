import java.util.Scanner;

/** Q14 — Jubail Factory Counter | increment operator */
public class BasicsQuestion14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();if(n<0||n>10000)System.out.println("Invalid count");else{n++;System.out.println("Updated count: "+n);}
        sc.close();
    }
}
