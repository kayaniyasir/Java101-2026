import java.util.Scanner;

/** 1D Arrays in Java | Question 22: Jeddah Beach Cleanup Total. */
public class ArrayQuestion22 {
    static int sum(int[] values){int result=0;for(int x:values)result+=x;return result;}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>10){System.out.println("Invalid size");return;}int[] a=new int[n];boolean ok=true;for(int i=0;i<n;i++){a[i]=sc.nextInt();if(a[i]<0||a[i]>100)ok=false;}System.out.println(ok?"Total bags: "+sum(a):"Invalid count");
        sc.close();
    }
}
