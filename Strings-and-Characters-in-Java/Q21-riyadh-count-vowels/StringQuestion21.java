import java.util.Scanner;

/** Question 21: Riyadh Count Vowels — loop and charAt(). */
public class StringQuestion21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.next().toLowerCase(java.util.Locale.ROOT);int count=0;for(int i=0;i<word.length();i++){char c=word.charAt(i);if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')count++;}System.out.println("Vowels: "+count);
        sc.close();
    }
}
