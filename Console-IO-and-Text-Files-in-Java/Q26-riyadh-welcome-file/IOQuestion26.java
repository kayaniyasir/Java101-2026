import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IOQuestion26 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();PrintWriter out=new PrintWriter(new File("welcome.txt"));out.println("Welcome to Riyadh, "+name+"!");out.close();System.out.println("Created welcome.txt");
        sc.close();
    }
}
