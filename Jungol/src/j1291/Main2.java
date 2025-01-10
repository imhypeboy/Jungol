package j1291;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int a = in.nextInt(), b = in.nextInt();
            if (!valid(a, b)) {
                System.out.println("INPUT ERROR!");
                continue;
            }
            gugudan(a, b);
            break;
        }

        in.close();
    }

    public static boolean valid(int a, int b) {
        return a >= 2 && a <= 9 && b >= 2 && b <= 9;
    }

    public static void gugudan(int a, int b) {
        int step = (a <= b) ? 1 : -1;

        for (int i = 1; i <= 9; i++) {
            for (int j = a; j != b + step; j += step) {
                System.out.printf("%d * %d = %2d", j, i, j * i);
                if (j != b) System.out.print("   ");
            }
            System.out.println();
        }
    }
}
