import java.util.Scanner;

/** 1D Arrays in Java | Question 24: Taif Souvenir Price Copy. */
public class ArrayQuestion24 {
    static int[] duplicate(int[] a){int[] copy=new int[a.length];for(int i=0;i<a.length;i++)copy[i]=a[i];return copy;}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>10){System.out.println("Invalid size");return;}int[] a=new int[n];boolean ok=true;for(int i=0;i<n;i++){a[i]=sc.nextInt();if(a[i]<0||a[i]>1000)ok=false;}if(!ok){System.out.println("Invalid price");return;}int[] b=duplicate(a);System.out.print("Copied prices:");for(int x:b)System.out.print(" "+x);System.out.println();
        sc.close();
    }
}
