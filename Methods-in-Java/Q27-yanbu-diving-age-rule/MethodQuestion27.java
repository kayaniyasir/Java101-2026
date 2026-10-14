import java.util.Scanner;

/** Yanbu Diving Age Rule — Java methods practice. */
public class MethodQuestion27 {
    static boolean canJoin(int age){return age>=16&&age<=60;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();if(age<0||age>120)System.out.println("Invalid age");else System.out.println(canJoin(age)?"Allowed":"Not allowed");
        sc.close();
    }
}
