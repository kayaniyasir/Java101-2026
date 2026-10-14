import java.util.Scanner;

/** 1D Arrays in Java | Question 07: Hail Even Seat Numbers. */
public class ArrayQuestion07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>20){System.out.println("Invalid size");return;}int[] a=new int[n];int ev=0,odd=0;boolean valid=true;for(int i=0;i<n;i++){a[i]=sc.nextInt();if(a[i]<1||a[i]>999)valid=false;if(a[i]%2==0)ev++;else odd++;}if(!valid)System.out.println("Invalid seat");else{System.out.println("Even: "+ev);System.out.println("Odd: "+odd);}
        sc.close();
    }
}
