import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOQuestion24 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file=new Scanner(new File("prices.txt"));
        int total=0;boolean valid=true;while(file.hasNextInt()){int value=file.nextInt();if(value<0)valid=false;total+=value;}System.out.println(valid?"Total: SAR "+total:"Invalid price");
        file.close();
    }
}
