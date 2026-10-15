import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Q19: Taif Rainfall File Maximum */
public class IOQuestion19 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file=new Scanner(new File("rain.txt"));
        
        if(!file.hasNextInt()){System.out.println("No readings");}else{int max=file.nextInt();while(file.hasNextInt()){int x=file.nextInt();if(x>max)max=x;}System.out.println("Maximum rainfall: "+max);}
        file.close();
        
    }
}
