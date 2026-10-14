/**
 * Basic Loops in Java — Question 08
 * Jazan Date Box Counter
 * Main topic: for
 * Jazan Date Box Counter
 * Sample input: 25
 * Expected output: Boxes: 5
 */
import java.util.Scanner;

public class LoopQuestion08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kg=sc.nextInt();if(kg<0||kg>500||kg%5!=0)System.out.println("Invalid harvest");else{int boxes=0;for(int w=5;w<=kg;w+=5)boxes++;System.out.println("Boxes: "+boxes);}
        sc.close();
    }
}
