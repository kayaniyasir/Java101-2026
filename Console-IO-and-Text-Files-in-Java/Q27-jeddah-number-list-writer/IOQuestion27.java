import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IOQuestion27 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>10){System.out.println("Invalid size");return;}PrintWriter out=new PrintWriter(new File("numbers.txt"));for(int i=1;i<=n;i++)out.println(i);out.close();System.out.println("Created numbers.txt");
        sc.close();
    }
}
