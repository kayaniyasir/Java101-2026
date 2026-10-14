import java.util.Scanner;
/** Question 20: Saudi City Weekend Choice. Focus: switch String. */
public class ConditionQuestion20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String city=sc.next().toLowerCase(java.util.Locale.ROOT);switch(city){case "riyadh":System.out.println("Museum");break;case "jeddah":System.out.println("Beach");break;case "abha":System.out.println("Mountains");break;default:System.out.println("City unavailable");}
        sc.close();
    }
}
