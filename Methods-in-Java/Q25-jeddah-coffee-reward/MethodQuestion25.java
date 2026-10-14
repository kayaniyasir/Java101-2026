import java.util.Scanner;

/** Jeddah Coffee Reward — Java methods practice. */
public class MethodQuestion25 {
    static boolean hasReward(int count){return count>=10;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=sc.nextInt();if(count<0||count>100)System.out.println("Invalid count");else System.out.println(hasReward(count)?"Reward available":"No reward");
        sc.close();
    }
}
