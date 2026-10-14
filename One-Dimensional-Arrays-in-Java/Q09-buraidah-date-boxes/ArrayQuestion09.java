import java.util.Scanner;

/** 1D Arrays in Java | Question 09: Buraidah Date Boxes. */
public class ArrayQuestion09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>10){System.out.println("Invalid size");return;}int[] a=new int[n];boolean valid=true;for(int i=0;i<n;i++){a[i]=sc.nextInt();if(a[i]<1||a[i]>9999)valid=false;}if(!valid){System.out.println("Invalid ID");return;}for(int i=n-1;i>=0;i--){if(i<n-1)System.out.print(" ");System.out.print(a[i]);}System.out.println();
        sc.close();
    }
}
