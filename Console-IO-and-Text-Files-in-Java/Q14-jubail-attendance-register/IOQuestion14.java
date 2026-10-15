import java.util.Scanner;

/** Q14: Jubail Attendance Register */
public class IOQuestion14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>20){System.out.println("Invalid size");return;}int present=0,absent=0;boolean ok=true;for(int i=0;i<n;i++){int x=sc.nextInt();if(x==1)present++;else if(x==0)absent++;else ok=false;}if(!ok)System.out.println("Invalid status");else{System.out.println("Present: "+present);System.out.println("Absent: "+absent);}
        sc.close();
    }
}
