import java.util.Scanner;
/** Conditions in Java — Question 29: Hail Weekend Sports Choice. */
public class ConditionQuestion29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice=sc.nextInt();switch(choice){case 1:System.out.println("Football");break;case 2:System.out.println("Basketball");break;case 3:System.out.println("Badminton");break;case 4:System.out.println("Swimming");break;default:System.out.println("Invalid choice");}
        sc.close();
    }
}
