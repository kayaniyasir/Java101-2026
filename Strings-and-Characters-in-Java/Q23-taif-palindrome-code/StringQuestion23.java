import java.util.Scanner;

/** Question 23: Taif Palindrome Code — two-pointer char comparisons. */
public class StringQuestion23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String code=sc.next().toLowerCase(java.util.Locale.ROOT);boolean same=true;for(int i=0;i<code.length()/2;i++){if(code.charAt(i)!=code.charAt(code.length()-1-i)){same=false;break;}}System.out.println(same?"Palindrome":"Not palindrome");
        sc.close();
    }
}
