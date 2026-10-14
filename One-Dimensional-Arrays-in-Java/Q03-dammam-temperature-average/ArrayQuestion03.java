import java.util.Scanner;

/** 1D Arrays in Java | Question 03: Dammam Temperature Average. */
public class ArrayQuestion03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>7){System.out.println("Invalid size");return;}int[] a=new int[n];int sum=0;boolean valid=true;for(int i=0;i<n;i++){a[i]=sc.nextInt();if(a[i]<-20||a[i]>60)valid=false;sum+=a[i];}if(!valid)System.out.println("Invalid temperature");else System.out.printf("Average: %.1f C%n",(double)sum/n);
        sc.close();
    }
}
