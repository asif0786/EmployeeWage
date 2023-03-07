import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int WPHour = 20;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Working Hours :");
        int TWH = sc.nextInt();
        System.out.print("Enter Total Working Days :");
        int TWD = sc.nextInt();

        if(TWH >= 100 || TWD >= 20) {
            int TEWage = TWH * TWD * WPHour;
            System.out.println("Total Wage = Rs." + TEWage);

        }else {
            System.out.println("TWH or TWD are less");
        }

    }
}