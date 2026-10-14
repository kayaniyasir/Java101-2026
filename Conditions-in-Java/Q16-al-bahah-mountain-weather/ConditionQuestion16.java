import java.util.Scanner;
/** Question 16: Al Bahah Mountain Weather. Focus: logical OR. */
public class ConditionQuestion16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wind=sc.nextInt(),rain=sc.nextInt();if(wind<0||wind>200||rain<0||rain>500)System.out.println("Invalid weather");else if(wind>=50||rain>=30)System.out.println("Cancel outing");else System.out.println("Outing approved");
        sc.close();
    }
}
