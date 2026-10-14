import java.util.Scanner;
/** Conditions in Java — Question 24: Yanbu Exam Grade Letters. */
public class ConditionQuestion24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark=sc.nextInt();if(mark<0||mark>100)System.out.println("Invalid mark");else if(mark>=90)System.out.println("A");else if(mark>=80)System.out.println("B");else if(mark>=70)System.out.println("C");else if(mark>=60)System.out.println("D");else System.out.println("F");
        sc.close();
    }
}
