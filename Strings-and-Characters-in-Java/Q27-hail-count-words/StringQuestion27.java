import java.util.Scanner;

/** Question 27: Hail Count Words — trim and whitespace handling. */
public class StringQuestion27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine().trim();int words=0;boolean inside=false;for(int i=0;i<line.length();i++){char c=line.charAt(i);if(Character.isWhitespace(c))inside=false;else if(!inside){words++;inside=true;}}System.out.println("Words: "+words);
        sc.close();
    }
}
