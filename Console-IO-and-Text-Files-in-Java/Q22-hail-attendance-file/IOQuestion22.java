import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Q22: Hail Attendance File */
public class IOQuestion22 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file=new Scanner(new File("attendance.txt"));
        
        int p=0,a=0;boolean ok=true;while(file.hasNextInt()){int status=file.nextInt();if(status==1)p++;else if(status==0)a++;else ok=false;}if(!ok)System.out.println("Invalid status");else{System.out.println("Present: "+p);System.out.println("Absent: "+a);}
        file.close();
        
    }
}
