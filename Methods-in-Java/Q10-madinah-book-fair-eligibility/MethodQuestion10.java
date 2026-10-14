import java.util.Scanner;

/** Madinah Book Fair Eligibility — Java methods practice. */
public class MethodQuestion10 {
    static boolean eligible(int age,int books){return age>=12&&age<=18&&books>=3;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt(),books=sc.nextInt();if(age<0||age>120||books<0)System.out.println("Invalid input");else System.out.println(eligible(age,books)?"Eligible":"Not eligible");
        sc.close();
    }
}
