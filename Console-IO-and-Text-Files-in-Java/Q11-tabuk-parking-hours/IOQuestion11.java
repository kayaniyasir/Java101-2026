import java.util.Scanner;

/** Q11: Tabuk Parking Hours */
public class IOQuestion11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int minutes=sc.nextInt();if(minutes<0||minutes>10000)System.out.println("Invalid minutes");else{System.out.println("Hours: "+minutes/60);System.out.println("Minutes: "+minutes%60);}
        sc.close();
    }
}
