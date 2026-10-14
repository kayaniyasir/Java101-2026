import java.util.Scanner;
/** Conditions in Java — Question 22: Riyadh Club Registration. */
public class ConditionQuestion22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt(),consent=sc.nextInt();if(age<0||age>120||(consent!=0&&consent!=1))System.out.println("Invalid input");else if(age>=14&&age<=18&&consent==1)System.out.println("Registered");else System.out.println("Not registered");
        sc.close();
    }
}
