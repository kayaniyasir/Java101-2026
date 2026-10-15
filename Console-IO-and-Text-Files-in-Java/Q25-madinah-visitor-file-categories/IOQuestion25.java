import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOQuestion25 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file=new Scanner(new File("ages.txt"));
        int children=0,adults=0;boolean valid=true;while(file.hasNextInt()){int age=file.nextInt();if(age<0||age>120)valid=false;else if(age<18)children++;else adults++;}if(!valid)System.out.println("Invalid age");else{System.out.println("Under 18: "+children);System.out.println("Adults: "+adults);}
        file.close();
    }
}
