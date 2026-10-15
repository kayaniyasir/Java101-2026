import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IOQuestion28 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        int boxes=sc.nextInt(),kg=sc.nextInt();if(boxes<0||boxes>100||kg<0||kg>100){System.out.println("Invalid input");return;}PrintWriter out=new PrintWriter(new File("fruit-report.txt"));out.println("Boxes: "+boxes);out.println("Kg per box: "+kg);out.println("Total kg: "+(boxes*kg));out.close();System.out.println("Created fruit-report.txt");
        sc.close();
    }
}
