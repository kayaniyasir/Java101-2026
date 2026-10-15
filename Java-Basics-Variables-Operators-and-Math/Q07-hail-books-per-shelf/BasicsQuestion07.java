import java.util.Scanner;

/** Q07 — Hail Books per Shelf | integer division */
public class BasicsQuestion07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int books=sc.nextInt(),shelves=sc.nextInt();if(books<0||books>1000||shelves<1||shelves>100)System.out.println("Invalid input");else System.out.println("Books per shelf: "+(books/shelves));
        sc.close();
    }
}
