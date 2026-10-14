import java.util.Scanner;

/** 1D Arrays in Java | Question 04: Taif Fruit Basket Maximum. */
public class ArrayQuestion04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>10){System.out.println("Invalid size");return;}int[] a=new int[n];boolean valid=true;for(int i=0;i<n;i++){a[i]=sc.nextInt();if(a[i]<0||a[i]>100)valid=false;}if(!valid){System.out.println("Invalid weight");return;}int max=a[0];for(int i=1;i<n;i++)if(a[i]>max)max=a[i];System.out.println("Maximum: "+max+" kg");
        sc.close();
    }
}
