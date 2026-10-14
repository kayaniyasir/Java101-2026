import java.util.Scanner;

/** 1D Arrays in Java | Question 05: Abha Hiking Minimum Time. */
public class ArrayQuestion05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>10){System.out.println("Invalid size");return;}int[] a=new int[n];boolean valid=true;for(int i=0;i<n;i++){a[i]=sc.nextInt();if(a[i]<1||a[i]>300)valid=false;}if(!valid){System.out.println("Invalid time");return;}int min=a[0];for(int i=1;i<n;i++)if(a[i]<min)min=a[i];System.out.println("Fastest: "+min+" minutes");
        sc.close();
    }
}
