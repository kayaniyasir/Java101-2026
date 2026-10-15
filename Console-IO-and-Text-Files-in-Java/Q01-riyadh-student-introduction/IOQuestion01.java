import java.util.Scanner;

/** Q01: Riyadh Student Introduction */
public class IOQuestion01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();int age=sc.nextInt();if(age<0||age>120)System.out.println("Invalid age");else{System.out.println("Student: "+name);System.out.println("Age: "+age);}
        sc.close();
    }
}
