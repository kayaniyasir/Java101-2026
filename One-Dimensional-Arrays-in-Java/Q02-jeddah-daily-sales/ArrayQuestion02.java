import java.util.Scanner;

/** 1D Arrays in Java | Question 02: Jeddah Daily Sales. */
public class ArrayQuestion02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>7){System.out.println("Invalid size");return;}int[] a=new int[n];int sum=0;boolean valid=true;for(int i=0;i<n;i++){a[i]=sc.nextInt();if(a[i]<0||a[i]>10000)valid=false;sum+=a[i];}System.out.println(valid?"Total sales: "+sum:"Invalid sale");
        sc.close();
    }
}
