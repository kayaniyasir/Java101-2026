import java.util.Scanner;

/** 1D Arrays in Java | Question 01: Riyadh Exam Marks. */
public class ArrayQuestion01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>10){System.out.println("Invalid size");return;}int[] a=new int[n];boolean valid=true;for(int i=0;i<n;i++){a[i]=sc.nextInt();if(a[i]<0||a[i]>100)valid=false;}if(!valid){System.out.println("Invalid mark");return;}for(int i=0;i<n;i++){if(i>0)System.out.print(" ");System.out.print(a[i]);}System.out.println();
        sc.close();
    }
}
