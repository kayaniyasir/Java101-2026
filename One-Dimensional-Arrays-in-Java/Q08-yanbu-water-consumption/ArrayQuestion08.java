import java.util.Scanner;

/** 1D Arrays in Java | Question 08: Yanbu Water Consumption. */
public class ArrayQuestion08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>20){System.out.println("Invalid size");return;}int[] a=new int[n];boolean valid=true;for(int i=0;i<n;i++){a[i]=sc.nextInt();if(a[i]<0||a[i]>10)valid=false;}int target=sc.nextInt();if(!valid||target<0||target>10){System.out.println("Invalid count");return;}int matches=0;for(int v:a)if(v==target)matches++;System.out.println("Matches: "+matches);
        sc.close();
    }
}
