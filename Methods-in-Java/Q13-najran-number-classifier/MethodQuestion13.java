import java.util.Scanner;

/** Najran Number Classifier — Java methods practice. */
public class MethodQuestion13 {
    static String describe(int n){if(n>0)return "Positive";if(n<0)return "Negative";return "Zero";}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(describe(sc.nextInt()));
        sc.close();
    }
}
