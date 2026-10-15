import java.util.Scanner;

/** Q15: Riyadh Grade Report */
public class IOQuestion15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();int a=sc.nextInt(),b=sc.nextInt();if(a<0||a>100||b<0||b>100)System.out.println("Invalid score");else{System.out.println("Student: "+name);System.out.printf("Test 1: %d%n",a);System.out.printf("Test 2: %d%n",b);System.out.printf("Average: %.1f%n",(a+b)/2.0);}
        sc.close();
    }
}
