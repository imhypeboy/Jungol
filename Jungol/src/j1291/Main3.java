package j1291;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s, e;

        do {
            s = sc.nextInt();
            e = sc.nextInt();

            if (s < 2 || s > 9 || e < 2 || e > 9) {
                System.out.println("INPUT ERROR!");
            }
        } while (s < 2 || s > 9 || e < 2 || e > 9); // 입력이 유효하지 않으면 반복

        printGugudan(s, e); // 유효한 입력 후 구구단 출력
        sc.close();
    }

    public static void printGugudan(int s, int e) {
        int step = (s <= e) ? 1 : -1; // 오름차순(1) 또는 내림차순(-1) 설정

        for (int i = 1; i <= 9; i++) { // 구구단 1~9 반복
            for (int j = s; j != e + step; j += step) { // s에서 e까지 진행
                System.out.printf("%d * %d = %2d", j, i, j * i);
                if (j != e) System.out.print("   "); // 단 사이 공백 추가
            }
            System.out.println(); // 줄바꿈
        }
    }
}