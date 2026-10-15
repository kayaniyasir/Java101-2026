import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Q20: Abha Student Marks Pass Count */
public class IOQuestion20 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file=new Scanner(new File("marks.txt"));
        
        int count=0;while(file.hasNextInt()){if(file.nextInt()>=50)count++;}System.out.println("Passed: "+count);
        file.close();
        
    }
}
