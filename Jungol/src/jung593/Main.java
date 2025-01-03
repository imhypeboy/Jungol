package jung593;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("ASCII code =? ");
            int num = sc.nextInt();

            if (num >= 33 && num <= 127) {
                System.out.println("" + (char) num);
            } else {
                //System.out.println("Out of range. Program terminated.");
                break;
            }
        }

        sc.close();
    }
}