import java.util.Scanner;

/** Riyadh Welcome Message — Java methods practice. */
public class MethodQuestion01 {
    static void welcome(){System.out.println("Welcome to Riyadh Coding Day!");}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        welcome();welcome();
        sc.close();
    }
}
