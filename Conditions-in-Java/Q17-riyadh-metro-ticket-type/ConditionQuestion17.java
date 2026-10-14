import java.util.Scanner;
/** Question 17: Riyadh Metro Ticket Type. Focus: switch. */
public class ConditionQuestion17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option=sc.nextInt();switch(option){case 1:System.out.println("Single: SAR 4");break;case 2:System.out.println("Day: SAR 12");break;case 3:System.out.println("Weekly: SAR 50");break;default:System.out.println("Invalid ticket");}
        sc.close();
    }
}
