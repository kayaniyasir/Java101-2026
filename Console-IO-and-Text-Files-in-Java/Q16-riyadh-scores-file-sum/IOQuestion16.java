import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Q16: Riyadh Scores File Sum */
public class IOQuestion16 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file=new Scanner(new File("scores.txt"));
        
        int total=0;while(file.hasNextInt())total+=file.nextInt();System.out.println("Total scores: "+total);
        file.close();
        
    }
}
