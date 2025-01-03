package b2720;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int cents = sc.nextInt();

            int quarters = cents / 25;
            cents %= 25;

            int dimes = cents / 10;
            cents %= 10;

            int nickels = cents / 5;
            cents %= 5;

            int pennies = cents;

            System.out.println(quarters + " " + dimes + " " + nickels + " " + pennies);
        }

        sc.close();
    }
}