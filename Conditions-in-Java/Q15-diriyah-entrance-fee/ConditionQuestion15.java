import java.util.Scanner;
/** Question 15: Diriyah Entrance Fee. Focus: nested if-else. */
public class ConditionQuestion15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt(),pass=sc.nextInt();if(age<0||age>120||(pass!=0&&pass!=1))System.out.println("Invalid input");else{int fee;if(pass==1){fee=0;}else{if(age<13)fee=15;else fee=30;}System.out.println("Fee: SAR "+fee);}
        sc.close();
    }
}
