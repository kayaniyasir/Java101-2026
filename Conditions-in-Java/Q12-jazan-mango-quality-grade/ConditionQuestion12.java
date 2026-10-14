import java.util.Scanner;
/** Question 12: Jazan Mango Quality Grade. Focus: if-else-if. */
public class ConditionQuestion12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score=sc.nextInt();if(score<0||score>100)System.out.println("Invalid score");else if(score>=90)System.out.println("Premium");else if(score>=70)System.out.println("Good");else System.out.println("Regular");
        sc.close();
    }
}
