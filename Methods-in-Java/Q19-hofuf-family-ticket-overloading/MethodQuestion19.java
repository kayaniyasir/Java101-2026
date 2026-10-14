import java.util.Scanner;

/** Hofuf Family Ticket Overloading — Java methods practice. */
public class MethodQuestion19 {
    static int ticket(int adults){return adults*30;}
    static int ticket(int adults,int children){return ticket(adults)+children*15;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int adults=sc.nextInt(),children=sc.nextInt();if(adults<0||adults>30||children<0||children>30)System.out.println("Invalid counts");else{System.out.println("Adults only: SAR "+ticket(adults));System.out.println("Family: SAR "+ticket(adults,children));}
        sc.close();
    }
}
