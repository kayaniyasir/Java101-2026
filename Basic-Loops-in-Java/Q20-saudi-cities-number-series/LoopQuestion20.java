/** Basic Loops in Java - Question 20: Saudi Cities Number Series
 * Loop focus: for + continue
 * Sample input: 10
 * Expected output: 1 2 3 5 6 7 9 10
 */
import java.util.Scanner;
public class LoopQuestion20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>30)System.out.println("Invalid limit");else{boolean first=true;for(int i=1;i<=n;i++){if(i%4==0)continue;if(!first)System.out.print(" ");System.out.print(i);first=false;}System.out.println();}
        sc.close();
    }
}
