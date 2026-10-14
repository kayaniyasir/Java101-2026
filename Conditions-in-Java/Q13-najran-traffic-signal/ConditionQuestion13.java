import java.util.Scanner;
/** Question 13: Najran Traffic Signal. Focus: switch with char. */
public class ConditionQuestion13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char color=Character.toUpperCase(sc.next().charAt(0));switch(color){case 'R':System.out.println("Stop");break;case 'Y':System.out.println("Wait");break;case 'G':System.out.println("Go");break;default:System.out.println("Invalid signal");}
        sc.close();
    }
}
