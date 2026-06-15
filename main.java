import java.util.Scanner;
public class Main {
    // Function to calculate Simple Interest
    static double calculateSimpleInterest(double principal,double rate,double time) {
        double a = (principal*rate*time)/100;
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();
        double si = calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest = " + si);
        sc.close();
    }
}
