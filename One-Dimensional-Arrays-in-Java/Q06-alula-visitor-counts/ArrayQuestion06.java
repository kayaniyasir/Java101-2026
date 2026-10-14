import java.util.Scanner;

/** 1D Arrays in Java | Question 06: AlUla Visitor Counts. */
public class ArrayQuestion06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>10){System.out.println("Invalid size");return;}int[] a=new int[n];int count=0;boolean valid=true;for(int i=0;i<n;i++){a[i]=sc.nextInt();if(a[i]<0||a[i]>10000)valid=false;if(a[i]>100)count++;}System.out.println(valid?"Busy days: "+count:"Invalid visitors");
        sc.close();
    }
}
