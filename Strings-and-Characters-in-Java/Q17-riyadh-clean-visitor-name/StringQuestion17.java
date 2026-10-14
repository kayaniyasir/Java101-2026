import java.util.Scanner;

/** Question 17: Riyadh Clean Visitor Name — trim(). */
public class StringQuestion17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine().trim();if(name.isEmpty())System.out.println("Invalid name");else System.out.println("Name: "+name);
        sc.close();
    }
}
