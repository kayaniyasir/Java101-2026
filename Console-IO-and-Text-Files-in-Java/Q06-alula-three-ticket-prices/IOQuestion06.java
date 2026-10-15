import java.util.Scanner;

/** Q06: AlUla Three Ticket Prices */
public class IOQuestion06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();if(a<0||b<0||c<0||a>10000||b>10000||c>10000)System.out.println("Invalid price");else{System.out.printf("Total: SAR %.2f%n",a+b+c);System.out.printf("Average: SAR %.2f%n",(a+b+c)/3);}
        sc.close();
    }
}
