import java.util.Scanner;

/** Q09: Buraidah Date Box Average */
public class IOQuestion09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();if(n<1||n>10){System.out.println("Invalid size");return;}int sum=0;boolean ok=true;for(int i=0;i<n;i++){int w=sc.nextInt();if(w<0||w>100)ok=false;sum+=w;}if(!ok)System.out.println("Invalid weight");else System.out.printf("Average: %.1f kg%n",(double)sum/n);
        sc.close();
    }
}
