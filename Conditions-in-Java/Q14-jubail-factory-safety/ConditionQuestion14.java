import java.util.Scanner;
/** Question 14: Jubail Factory Safety. Focus: logical AND. */
public class ConditionQuestion14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int helmet=sc.nextInt(),training=sc.nextInt();if((helmet!=0&&helmet!=1)||(training!=0&&training!=1))System.out.println("Invalid input");else if(helmet==1&&training==1)System.out.println("Entry allowed");else System.out.println("Entry denied");
        sc.close();
    }
}
