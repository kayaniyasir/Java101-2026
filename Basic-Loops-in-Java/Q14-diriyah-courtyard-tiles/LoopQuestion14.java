/**
 * Basic Loops in Java - Question 14: Diriyah Courtyard Tiles
 * Focus: nested for
 * Sample input: 2 4
 * Expected: #### | ####
 */
import java.util.Scanner;

public class LoopQuestion14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt(),cols=sc.nextInt();if(rows<1||rows>6||cols<1||cols>6)System.out.println("Invalid dimensions");else for(int r=0;r<rows;r++){for(int c=0;c<cols;c++)System.out.print("#");System.out.println();}
        sc.close();
    }
}
