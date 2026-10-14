import java.util.Scanner;
/** Conditions in Java — Question 25: Al Khobar Maximum of Three. */
public class ConditionQuestion25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();int largest;if(a>=b){if(a>=c)largest=a;else largest=c;}else{if(b>=c)largest=b;else largest=c;}System.out.println("Largest: "+largest);
        sc.close();
    }
}
