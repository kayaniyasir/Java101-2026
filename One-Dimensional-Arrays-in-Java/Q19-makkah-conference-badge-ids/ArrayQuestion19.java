import java.util.Scanner;

/** 1D Arrays in Java | Question 19: Makkah Conference Badge IDs. */
public class ArrayQuestion19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>10){System.out.println("Invalid size");return;}int[] a=new int[n];boolean ok=true;for(int i=0;i<n;i++){a[i]=sc.nextInt();if(a[i]<1||a[i]>9999)ok=false;}int t=sc.nextInt();if(!ok||t<1||t>9999){System.out.println("Invalid ID");return;}int count=0;for(int v:a)if(v==t)count++;System.out.println("Occurrences: "+count);
        sc.close();
    }
}
