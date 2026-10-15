import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IOQuestion30 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();int mark=sc.nextInt();if(mark<0||mark>100){System.out.println("Invalid mark");return;}PrintWriter out=new PrintWriter(new File("result.txt"));out.println("Student: "+name);out.println("Mark: "+mark);out.println("Result: "+(mark>=50?"Pass":"Fail"));out.close();System.out.println("Created result.txt");
        sc.close();
    }
}
