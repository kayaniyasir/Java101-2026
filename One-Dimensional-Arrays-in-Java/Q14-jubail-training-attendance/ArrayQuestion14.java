import java.util.Scanner;

/** 1D Arrays in Java | Question 14: Jubail Training Attendance. */
public class ArrayQuestion14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>10){System.out.println("Invalid size");return;}int[] a=new int[n],b=new int[n];int x=0,y=0;boolean ok=true;for(int i=0;i<n;i++){a[i]=sc.nextInt();if(a[i]<0||a[i]>100)ok=false;x+=a[i];}for(int i=0;i<n;i++){b[i]=sc.nextInt();if(b[i]<0||b[i]>100)ok=false;y+=b[i];}if(!ok)System.out.println("Invalid count");else System.out.println(x>y?"Morning":x<y?"Evening":"Equal");
        sc.close();
    }
}
