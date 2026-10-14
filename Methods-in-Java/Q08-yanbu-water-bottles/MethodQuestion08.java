import java.util.Scanner;

/** Yanbu Water Bottles — Java methods practice. */
public class MethodQuestion08 {
    static int totalBottles(int groups,int perGroup){return groups*perGroup;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g=sc.nextInt(),p=sc.nextInt();if(g<0||g>100||p<0||p>100)System.out.println("Invalid input");else System.out.println("Bottles needed: "+totalBottles(g,p));
        sc.close();
    }
}
