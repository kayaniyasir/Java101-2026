import java.util.Scanner;

/** Abha Triangle Area — Java methods practice. */
public class MethodQuestion29 {
    static double triangleArea(double base,double height){return base*height/2;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base=sc.nextDouble(),height=sc.nextDouble();if(base<0||base>1000||height<0||height>1000)System.out.println("Invalid dimensions");else System.out.printf("Area: %.2f%n",triangleArea(base,height));
        sc.close();
    }
}
