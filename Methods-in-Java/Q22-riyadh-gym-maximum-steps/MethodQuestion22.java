import java.util.Scanner;

/** Riyadh Gym Maximum Steps — Java methods practice. */
public class MethodQuestion22 {
    static int maxSteps(int a,int b){return a>b?a:b;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();if(a<0||b<0||a>100000||b>100000)System.out.println("Invalid steps");else System.out.println("Maximum steps: "+maxSteps(a,b));
        sc.close();
    }
}
