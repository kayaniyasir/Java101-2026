import java.util.Scanner;

/** Saudi School Report Generator — Java methods practice. */
public class MethodQuestion30 {
    static int max(int a,int b){return a>b?a:b;}
    static int bestOfThree(int a,int b,int c){int firstTwo=max(a,b);return max(firstTwo,c);}
    static void showResult(int score){System.out.println("Highest mark: "+score);}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();if(a<0||a>100||b<0||b>100||c<0||c>100)System.out.println("Invalid marks");else showResult(bestOfThree(a,b,c));
        sc.close();
    }
}
