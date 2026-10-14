import java.util.Scanner;

/** 1D Arrays in Java | Question 20: Sakaka Number Range Filter. */
public class ArrayQuestion20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>15){System.out.println("Invalid size");return;}int[] a=new int[n];boolean ok=true;for(int i=0;i<n;i++){a[i]=sc.nextInt();if(a[i]<0||a[i]>100)ok=false;}int low=sc.nextInt(),high=sc.nextInt();if(!ok||low<0||high>100||low>high){System.out.println("Invalid range or score");return;}boolean first=true;for(int v:a)if(v>=low&&v<=high){if(!first)System.out.print(" ");System.out.print(v);first=false;}if(first)System.out.print("None");System.out.println();
        sc.close();
    }
}
