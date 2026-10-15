import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Q17: Jeddah Sales File Average */
public class IOQuestion17 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file=new Scanner(new File("sales.txt"));
        
        int count=0;double total=0;while(file.hasNextDouble()){total+=file.nextDouble();count++;}if(count==0)System.out.println("No sales");else System.out.printf("Average sale: %.2f%n",total/count);
        file.close();
        
    }
}
