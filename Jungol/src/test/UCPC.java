package test;

import java.util.Scanner;

public class UCPC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 코스의 구간 수
        String purchaseStatus = scanner.next(); // 기념품 구매 여부

        char[] course = new char[n];
        int mood = 0;

        boolean possible = true;

        for (int i = 0; i < n; i++) {
            char current = purchaseStatus.charAt(i);

            if (current == 'O') {
                // 기념품을 구매했으므로 호감도가 0 이상이어야 함
                if (mood < 0) {
                    // 음수에서 호감도를 증가시키기 위해 설원 선택
                    course[i] = '+';
                    mood++;
                } else {
                    // 현재 호감도가 0 이상이면 설원 선택
                    course[i] = '+';
                    mood++;
                }
            } else if (current == 'X') {
                // 기념품을 구매하지 않았으므로 호감도가 음수여야 함
                if (mood > 0) {
                    // 양수에서 호감도를 감소시키기 위해 사막 선택
                    course[i] = '-';
                    mood--;
                } else {
                    // 현재 호감도가 음수거나 0이면 사막 선택
                    course[i] = '-';
                    mood--;
                }
            }
        }

        // 최종적으로 호감도가 0이어야 함
        if (mood != 0) {
            possible = false;
        }

        if (possible) {
            System.out.println("YES");
            System.out.println(new String(course));
        } else {
            System.out.println("NO");
        }
    }
}