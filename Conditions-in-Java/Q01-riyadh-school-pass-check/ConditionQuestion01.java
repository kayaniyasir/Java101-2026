import java.util.Scanner;

/** Question 01: Riyadh School Pass Check | Topic: if-else. */
public class ConditionQuestion01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark=sc.nextInt(); if(mark<0||mark>100)System.out.println("Invalid mark"); else if(mark>=50)System.out.println("Pass"); else System.out.println("Fail");
        sc.close();
    }
}
