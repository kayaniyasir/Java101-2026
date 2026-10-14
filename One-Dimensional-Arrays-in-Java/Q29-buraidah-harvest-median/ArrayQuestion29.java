import java.util.Scanner;

/** 1D Arrays in Java | Question 29: Buraidah Harvest Median. */
public class ArrayQuestion29 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>9||n%2==0){System.out.println("Invalid size");return;}int[] a=new int[n];boolean ok=true;for(int i=0;i<n;i++){a[i]=sc.nextInt();if(a[i]<0||a[i]>1000)ok=false;}if(!ok){System.out.println("Invalid weight");return;}java.util.Arrays.sort(a);System.out.println("Median: "+a[n/2]);
        sc.close();
    }
}
