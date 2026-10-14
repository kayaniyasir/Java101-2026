import java.util.Scanner;

/** 1D Arrays in Java | Question 12: Jazan Mango Inventory Copy. */
public class ArrayQuestion12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>10){System.out.println("Invalid size");return;}int[] src=new int[n];boolean ok=true;for(int i=0;i<n;i++){src[i]=sc.nextInt();if(src[i]<0||src[i]>1000)ok=false;}if(!ok){System.out.println("Invalid count");return;}int[] copy=new int[n];for(int i=0;i<n;i++)copy[i]=src[i];System.out.print("Copied:");for(int v:copy)System.out.print(" "+v);System.out.println();
        sc.close();
    }
}
