package b1157;

import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toUpperCase();

        int[] counts = new int[26];
        int maxCount = 0;
        char result = '?';

        for (int i = 0; i < input.length(); i++) {
            counts[input.charAt(i) - 'A']++;
        }

        for (int i = 0; i < 26; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                result = (char) (i + 'A');
            } else if (counts[i] == maxCount && maxCount > 0) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}
