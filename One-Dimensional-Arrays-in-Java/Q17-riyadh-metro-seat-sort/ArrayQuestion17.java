import java.util.Scanner;

/** 1D Arrays in Java | Question 17: Riyadh Metro Seat Sort. */
public class ArrayQuestion17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>10){System.out.println("Invalid size");return;}int[] a=new int[n];boolean ok=true;for(int i=0;i<n;i++){a[i]=sc.nextInt();if(a[i]<1||a[i]>999)ok=false;}if(!ok){System.out.println("Invalid seat");return;}java.util.Arrays.sort(a);for(int i=0;i<n;i++){if(i>0)System.out.print(" ");System.out.print(a[i]);}System.out.println();
        sc.close();
    }
}
