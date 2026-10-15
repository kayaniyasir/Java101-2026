import java.util.Scanner;

/** Q07: Hail Workshop Grade */
public class IOQuestion07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();if(score<0||score>100)System.out.println("Invalid score");else System.out.println(score>=50?"Pass":"Fail");
        sc.close();
    }
}
