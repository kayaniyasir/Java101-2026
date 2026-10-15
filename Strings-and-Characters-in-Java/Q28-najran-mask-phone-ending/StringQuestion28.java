import java.util.Scanner;

/** Question 28: Najran Mask Phone Ending — substring and validation. */
public class StringQuestion28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String number=sc.next();boolean valid=number.length()==10;for(int i=0;i<number.length();i++)if(number.charAt(i)<'0'||number.charAt(i)>'9')valid=false;if(!valid)System.out.println("Invalid number");else System.out.println("******"+number.substring(6));
        sc.close();
    }
}
