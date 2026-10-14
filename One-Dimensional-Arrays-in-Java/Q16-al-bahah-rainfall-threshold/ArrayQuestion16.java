import java.util.Scanner;

/** 1D Arrays in Java | Question 16: Al Bahah Rainfall Threshold. */
public class ArrayQuestion16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>10){System.out.println("Invalid size");return;}int[] rain=new int[n];boolean ok=true;for(int i=0;i<n;i++){rain[i]=sc.nextInt();if(rain[i]<0||rain[i]>500)ok=false;}int t=sc.nextInt();if(!ok||t<0||t>500){System.out.println("Invalid input");return;}int index=-1;for(int i=0;i<n;i++)if(rain[i]>=t){index=i;break;}System.out.println(index<0?"No alert":"First alert index: "+index);
        sc.close();
    }
}
