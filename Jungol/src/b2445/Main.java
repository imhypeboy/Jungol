package b2445;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            appendRow(sb, i, n);
        }
        for (int i = n - 1; i > 0; i--) {
            appendRow(sb, i, n);
        }

        System.out.print(sb);
    }

    private static void appendRow(StringBuilder sb, int i, int n) {
        sb.append("*".repeat(i))
          .append(" ".repeat(2 * (n - i)))
          .append("*".repeat(i))
          .append("\n");
    }
}
