import java.util.Scanner;

/** Question 04: Taif Fruit Weight | Topic: if-else. */
public class ConditionQuestion04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kg=sc.nextDouble();if(kg<0||kg>100)System.out.println("Invalid weight");else if(kg>=10)System.out.println("Heavy basket");else System.out.println("Light basket");
        sc.close();
    }
}
