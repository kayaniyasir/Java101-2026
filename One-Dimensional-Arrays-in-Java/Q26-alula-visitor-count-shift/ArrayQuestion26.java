import java.util.Scanner;

/** 1D Arrays in Java | Question 26: AlUla Visitor Count Shift. */
public class ArrayQuestion26 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<2||n>10){System.out.println("Invalid size");return;}int[] a=new int[n];boolean ok=true;for(int i=0;i<n;i++){a[i]=sc.nextInt();if(a[i]<0||a[i]>1000)ok=false;}if(!ok){System.out.println("Invalid count");return;}for(int i=0;i<n-1;i++)a[i]=a[i+1];for(int i=0;i<n-1;i++){if(i>0)System.out.print(" ");System.out.print(a[i]);}System.out.println();
        sc.close();
    }
}
