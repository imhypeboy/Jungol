package lotto;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        int idx = 0;
        while (true) {
            int number = (int) (Math.random() * 45) + 1;

            boolean insert = true;
            for (int i = 0; i < idx; i++) { // Changed i <= idx to i < idx
                if (lotto[i] == number) {
                    insert = false;
                    break;
                }
            }

            if (insert) {
                lotto[idx] = number;
                idx++;
            }

            if (idx == 6) {
                break;
            }
        }

        Arrays.sort(lotto);

        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
    }
}