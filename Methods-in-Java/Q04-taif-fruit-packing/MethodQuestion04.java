import java.util.Scanner;

/** Taif Fruit Packing — Java methods practice. */
public class MethodQuestion04 {
    static int fullBaskets(int fruit){return fruit/4;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<0||n>1000)System.out.println("Invalid fruit count");else System.out.println("Full baskets: "+fullBaskets(n));
        sc.close();
    }
}
