import java.util.Scanner;

/** Question 09: Buraidah Scholarship Check | Topic: logical OR. */
public class ConditionQuestion09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score=sc.nextInt(),winner=sc.nextInt();if(score<0||score>100||(winner!=0&&winner!=1))System.out.println("Invalid input");else if(score>=90||winner==1)System.out.println("Eligible");else System.out.println("Not eligible");
        sc.close();
    }
}
