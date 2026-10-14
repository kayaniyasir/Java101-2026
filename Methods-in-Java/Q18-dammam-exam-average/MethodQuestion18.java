import java.util.Scanner;

/** Dammam Exam Average — Java methods practice. */
public class MethodQuestion18 {
    static double average(double a,double b,double c){return (a+b+c)/3;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();if(a<0||a>100||b<0||b>100||c<0||c>100)System.out.println("Invalid marks");else System.out.printf("Average: %.2f%n",average(a,b,c));
        sc.close();
    }
}
