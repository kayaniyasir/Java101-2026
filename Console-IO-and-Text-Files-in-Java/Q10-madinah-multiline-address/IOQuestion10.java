import java.util.Scanner;

/** Q10: Madinah Multiline Address */
public class IOQuestion10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int house=sc.nextInt();sc.nextLine();String street=sc.nextLine().trim();if(house<1||house>9999||street.isEmpty())System.out.println("Invalid address");else{System.out.println("House: "+house);System.out.println("Street: "+street);}
        sc.close();
    }
}
