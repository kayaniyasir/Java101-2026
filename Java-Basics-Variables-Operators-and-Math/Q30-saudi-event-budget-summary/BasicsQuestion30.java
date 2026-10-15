import java.util.Scanner;

/** Q30 — Saudi Event Budget Summary | combined arithmetic and Math */
public class BasicsQuestion30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double budget=sc.nextDouble(),spent=sc.nextDouble();int guests=sc.nextInt();if(budget<0||budget>100000||spent<0||spent>budget||guests<1||guests>1000)System.out.println("Invalid input");else{double remaining=budget-spent;System.out.printf("Remaining: SAR %.2f%n",remaining);System.out.println("Per guest: SAR "+(int)Math.ceil(remaining/guests));}
        sc.close();
    }
}
