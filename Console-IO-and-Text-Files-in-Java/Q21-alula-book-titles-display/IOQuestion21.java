import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Q21: AlUla Book Titles Display */
public class IOQuestion21 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file=new Scanner(new File("titles.txt"));
        
        while(file.hasNextLine())System.out.println("Book: "+file.nextLine());
        file.close();
        
    }
}
