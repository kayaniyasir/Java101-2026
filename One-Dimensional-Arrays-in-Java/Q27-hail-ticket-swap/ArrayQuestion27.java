import java.util.Scanner;

/** 1D Arrays in Java | Question 27: Hail Ticket Swap. */
public class ArrayQuestion27 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<2||n>10){System.out.println("Invalid size");return;}int[] a=new int[n];boolean ok=true;for(int i=0;i<n;i++){a[i]=sc.nextInt();if(a[i]<1||a[i]>999)ok=false;}int i=sc.nextInt(),j=sc.nextInt();if(!ok||i<0||j<0||i>=n||j>=n){System.out.println("Invalid input");return;}int temp=a[i];a[i]=a[j];a[j]=temp;for(int k=0;k<n;k++){if(k>0)System.out.print(" ");System.out.print(a[k]);}System.out.println();
        sc.close();
    }
}
