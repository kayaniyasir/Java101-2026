import java.util.Scanner;

/** Hail Student Grade — Java methods practice. */
public class MethodQuestion07 {
    static String grade(int mark){if(mark>=90)return "Excellent";if(mark>=70)return "Good";return "Needs improvement";}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();if(m<0||m>100)System.out.println("Invalid mark");else System.out.println(grade(m));
        sc.close();
    }
}
