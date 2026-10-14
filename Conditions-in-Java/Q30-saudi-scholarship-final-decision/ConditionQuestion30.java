import java.util.Scanner;
/** Conditions in Java — Question 30: Saudi Scholarship Final Decision. */
public class ConditionQuestion30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gpa=sc.nextDouble();int hours=sc.nextInt(),competition=sc.nextInt();if(gpa<0||gpa>4||hours<0||hours>1000||(competition!=0&&competition!=1))System.out.println("Invalid input");else if(gpa>=3.5&&(hours>=20||competition==1))System.out.println("Scholarship eligible");else System.out.println("Not eligible");
        sc.close();
    }
}
