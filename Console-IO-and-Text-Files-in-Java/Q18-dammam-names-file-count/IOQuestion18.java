import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Q18: Dammam Names File Count */
public class IOQuestion18 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file=new Scanner(new File("names.txt"));
        
        int count=0;while(file.hasNextLine()){file.nextLine();count++;}System.out.println("Names: "+count);
        file.close();
        
    }
}
