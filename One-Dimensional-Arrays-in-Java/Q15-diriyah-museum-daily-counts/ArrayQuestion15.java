import java.util.Scanner;

/** 1D Arrays in Java | Question 15: Diriyah Museum Daily Counts. */
public class ArrayQuestion15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>10){System.out.println("Invalid size");return;}int[] a=new int[n];int sum=0;boolean ok=true;for(int i=0;i<n;i++){a[i]=sc.nextInt();if(a[i]<0||a[i]>1000)ok=false;sum+=a[i];}if(!ok){System.out.println("Invalid count");return;}double avg=(double)sum/n;int low=0;for(int v:a)if(v<avg)low++;System.out.println("Below average: "+low);
        sc.close();
    }
}
