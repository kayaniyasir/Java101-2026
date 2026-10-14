import java.util.Scanner;

/** 1D Arrays in Java | Question 10: Madinah Book Fair Search. */
public class ArrayQuestion10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>10){System.out.println("Invalid size");return;}int[] a=new int[n];boolean valid=true;for(int i=0;i<n;i++){a[i]=sc.nextInt();if(a[i]<1||a[i]>9999)valid=false;}int key=sc.nextInt();if(!valid||key<1||key>9999){System.out.println("Invalid ID");return;}int position=-1;for(int i=0;i<n;i++){if(a[i]==key){position=i;break;}}System.out.println(position==-1?"Not found":"Found at index "+position);
        sc.close();
    }
}
