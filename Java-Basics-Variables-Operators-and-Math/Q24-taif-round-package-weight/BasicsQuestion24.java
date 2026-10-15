import java.util.Scanner;

/** Q24 — Taif Round Package Weight | Math.round */
public class BasicsQuestion24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double kg=sc.nextDouble();if(kg<0||kg>10000)System.out.println("Invalid weight");else System.out.println("Rounded weight: "+Math.round(kg)+" kg");
        sc.close();
    }
}
