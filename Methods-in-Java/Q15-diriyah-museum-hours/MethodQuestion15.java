import java.util.Scanner;

/** Diriyah Museum Hours — Java methods practice. */
public class MethodQuestion15 {
    static boolean isOpen(int hour){return hour>=9&&hour<17;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();if(h<0||h>23)System.out.println("Invalid hour");else System.out.println(isOpen(h)?"Open":"Closed");
        sc.close();
    }
}
