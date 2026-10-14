import java.util.Scanner;

/** Abha Temperature Checker — Java methods practice. */
public class MethodQuestion05 {
    static boolean isCool(int temp){return temp<=20;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();System.out.println(isCool(t)?"Cool day":"Warm day");
        sc.close();
    }
}
