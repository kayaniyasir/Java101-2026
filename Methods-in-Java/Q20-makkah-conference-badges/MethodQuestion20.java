import java.util.Scanner;

/** Makkah Conference Badges — Java methods practice. */
public class MethodQuestion20 {
    static void printBadge(int number){System.out.println("Attendee #"+number);}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>10)System.out.println("Invalid count");else for(int i=1;i<=n;i++)printBadge(i);
        sc.close();
    }
}
