import java.util.Scanner;
/** Question 11: Tabuk Bus Seat Selection. Focus: switch. */
public class ConditionQuestion11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code=sc.nextInt();switch(code){case 1:System.out.println("Standard");break;case 2:System.out.println("Window");break;case 3:System.out.println("Premium");break;default:System.out.println("Invalid seat");}
        sc.close();
    }
}
