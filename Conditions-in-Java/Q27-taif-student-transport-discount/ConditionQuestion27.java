import java.util.Scanner;
/** Conditions in Java — Question 27: Taif Student Transport Discount. */
public class ConditionQuestion27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt(),id=sc.nextInt();if(age<0||age>120||(id!=0&&id!=1))System.out.println("Invalid input");else{int fare=20;if(age<=18){if(id==1)fare=10;}System.out.println("Fare: SAR "+fare);}
        sc.close();
    }
}
