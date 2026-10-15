import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOQuestion23 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file=new Scanner(new File("inventory.txt"));
        Scanner sc=new Scanner(System.in);String target=sc.next();boolean found=false;while(file.hasNextLine())if(file.nextLine().equals(target))found=true;System.out.println(found?"Found":"Not found");sc.close();
        file.close();
    }
}
