import java.util.Scanner;

/** 1D Arrays in Java | Question 25: Abha Rainy Day Markers. */
public class ArrayQuestion25 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>10){System.out.println("Invalid size");return;}int[] a=new int[n];int rainy=0;boolean ok=true;for(int i=0;i<n;i++){a[i]=sc.nextInt();if(a[i]!=0&&a[i]!=1)ok=false;if(a[i]==1)rainy++;}System.out.println(ok?"Rainy days: "+rainy:"Invalid flag");
        sc.close();
    }
}
