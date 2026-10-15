import java.util.Scanner;

/** Q12 — Jazan Student Scores Cast | explicit casting */
public class BasicsQuestion12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int points=sc.nextInt(),questions=sc.nextInt();if(points<0||points>1000||questions<1||questions>100)System.out.println("Invalid input");else System.out.printf("Points per question: %.2f%n",(double)points/questions);
        sc.close();
    }
}
