// 스위치 켜고 끄기 

package b1244;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int switchCount = Integer.parseInt(br.readLine());
        int[] switches = Arrays.stream(br.readLine().split(" "))
                                .mapToInt(Integer::parseInt).toArray();
        int studentCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < studentCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());

            if (gender == 1) {
                for (int j = number - 1; j < switchCount; j += number) {
                    switches[j] ^= 1;
                }
            } else {
                int left = number - 2;
                int right = number;
                while (left >= 0 && right < switchCount && switches[left] == switches[right]) {
                    left--;
                    right++;
                }
                for (int j = left + 1; j < right; j++) {
                    switches[j] ^= 1;
                }
            }
        }

        for (int i = 0; i < switchCount; i++) {
            System.out.print(switches[i] + " ");
            if ((i + 1) % 20 == 0) System.out.println();
        }
    }
}
