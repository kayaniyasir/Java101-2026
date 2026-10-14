/**
 * Basic Loops in Java - Question 17: Jubail Workshop Attendance
 * Focus: for
 * Sample input: 5 | 1 0 1 1 0
 * Expected: Present: 3
 */
import java.util.Scanner;

public class LoopQuestion17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>30)System.out.println("Invalid student count");else{int present=0;boolean valid=true;for(int i=0;i<n;i++){int status=sc.nextInt();if(status!=0&&status!=1)valid=false;else if(status==1)present++;}System.out.println(valid?"Present: "+present:"Invalid status");}
        sc.close();
    }
}
