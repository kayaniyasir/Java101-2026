import java.util.Scanner;

/** Question 30: Saudi Student ID Summary — methods, char and String. */
public class StringQuestion30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next(),campus=sc.next(),suffix=sc.next();boolean ok=suffix.length()==3;for(int i=0;i<suffix.length();i++)if(!Character.isDigit(suffix.charAt(i)))ok=false;if(!ok)System.out.println("Invalid suffix");else System.out.println("ID: "+campus.toUpperCase(java.util.Locale.ROOT)+"-"+Character.toUpperCase(name.charAt(0))+"-"+suffix);
        sc.close();
    }
}
