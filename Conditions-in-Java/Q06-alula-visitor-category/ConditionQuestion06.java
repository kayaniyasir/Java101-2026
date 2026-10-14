import java.util.Scanner;

/** Question 06: AlUla Visitor Category | Topic: if-else-if ladder. */
public class ConditionQuestion06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();if(age<0||age>120)System.out.println("Invalid age");else if(age<=12)System.out.println("Child");else if(age<=17)System.out.println("Teen");else if(age<=59)System.out.println("Adult");else System.out.println("Senior");
        sc.close();
    }
}
