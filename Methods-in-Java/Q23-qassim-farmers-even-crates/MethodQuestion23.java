import java.util.Scanner;

/** Qassim Farmers Even Crates — Java methods practice. */
public class MethodQuestion23 {
    static boolean isEven(int n){return n%2==0;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>20)System.out.println("Invalid limit");else{boolean first=true;for(int i=1;i<=n;i++){if(isEven(i)){if(!first)System.out.print(" ");System.out.print(i);first=false;}}System.out.println();}
        sc.close();
    }
}
