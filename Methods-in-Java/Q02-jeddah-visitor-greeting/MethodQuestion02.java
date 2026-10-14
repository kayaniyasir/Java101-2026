import java.util.Scanner;

/** Jeddah Visitor Greeting — Java methods practice. */
public class MethodQuestion02 {
    static void greet(String name){System.out.println("Welcome to Jeddah, "+name+"!");}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=sc.next();greet(name);
        sc.close();
    }
}
