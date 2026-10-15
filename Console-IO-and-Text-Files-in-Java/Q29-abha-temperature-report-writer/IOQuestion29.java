import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IOQuestion29 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();if(a< -20||a>60||b< -20||b>60||c< -20||c>60){System.out.println("Invalid temperature");return;}PrintWriter out=new PrintWriter(new File("temperatures.txt"));out.printf("Average: %.1f C%n",(a+b+c)/3.0);out.close();System.out.println("Created temperatures.txt");
        sc.close();
    }
}
