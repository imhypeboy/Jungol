package b1157;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toUpperCase();
        sc.close();

        int[] counts = new int[26];
        for (char c : input.toCharArray()) {
            counts[c - 'A']++;
        }

        int maxCount = 0;
        char result = '?';
        for (int i = 0; i < 26; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                result = (char) (i + 'A');
            } else if (counts[i] == maxCount) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}