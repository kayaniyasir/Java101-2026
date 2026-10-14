import java.util.Scanner;

/** 1D Arrays in Java | Question 21: Riyadh Classroom Array Equality. */
public class ArrayQuestion21 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>10){System.out.println("Invalid size");return;}int[] a=new int[n],b=new int[n];boolean ok=true;for(int i=0;i<n;i++){a[i]=sc.nextInt();if(a[i]<1||a[i]>999)ok=false;}for(int i=0;i<n;i++){b[i]=sc.nextInt();if(b[i]<1||b[i]>999)ok=false;}System.out.println(!ok?"Invalid ID":java.util.Arrays.equals(a,b)?"Same arrays":"Different arrays");
        sc.close();
    }
}
