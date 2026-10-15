import java.util.Scanner;

/** Q04: Taif Flower Customer Name */
public class IOQuestion04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine().trim();System.out.println(name.isEmpty()?"Invalid name":"Customer: "+name);
        sc.close();
    }
}
