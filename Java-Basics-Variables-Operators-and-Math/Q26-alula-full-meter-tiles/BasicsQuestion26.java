import java.util.Scanner;

/** Q26 — AlUla Full Meter Tiles | Math.floor */
public class BasicsQuestion26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double meters=sc.nextDouble();if(meters<0||meters>1000)System.out.println("Invalid length");else System.out.println("Full meters: "+(int)Math.floor(meters));
        sc.close();
    }
}
