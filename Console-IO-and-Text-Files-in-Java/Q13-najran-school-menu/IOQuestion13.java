import java.util.Scanner;

/** Q13: Najran School Menu */
public class IOQuestion13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();switch(option){case 1:System.out.println("Lecture");break;case 2:System.out.println("Java Lab");break;case 3:System.out.println("Quiz");break;default:System.out.println("Invalid choice");}
        sc.close();
    }
}
