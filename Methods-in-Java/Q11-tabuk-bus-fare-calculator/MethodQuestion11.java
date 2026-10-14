import java.util.Scanner;

/** Tabuk Bus Fare Calculator — Java methods practice. */
public class MethodQuestion11 {
    static int busFare(int count){return count*7;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<0||n>50)System.out.println("Invalid passengers");else System.out.println("Fare: SAR "+busFare(n));
        sc.close();
    }
}
