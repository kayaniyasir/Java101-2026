import java.util.Scanner;

/** Q05: Abha Trip Distance */
public class IOQuestion05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double km=sc.nextDouble(),rate=sc.nextDouble();if(km<0||km>1000||rate<0||rate>1000)System.out.println("Invalid input");else System.out.printf("Fare: SAR %.2f%n",km*rate);
        sc.close();
    }
}
