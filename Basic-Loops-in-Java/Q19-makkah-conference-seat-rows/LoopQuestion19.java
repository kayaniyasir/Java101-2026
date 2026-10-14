/** Basic Loops in Java - Question 19: Makkah Conference Seat Rows
 * Loop focus: nested for
 * Sample input: 2 3
 * Expected output: 1 2 3 | 1 2 3
 */
import java.util.Scanner;
public class LoopQuestion19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt(),cols=sc.nextInt();if(rows<1||rows>5||cols<1||cols>5)System.out.println("Invalid dimensions");else for(int r=1;r<=rows;r++){for(int c=1;c<=cols;c++){if(c>1)System.out.print(" ");System.out.print(c);}System.out.println();}
        sc.close();
    }
}
