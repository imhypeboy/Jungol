package random;

import java.util.Scanner;

public class Main3 {
    static int n, m;
    static int[] ar;

    public static void dice(int p) {
        // 종료 조건
        if (p == n) {
            for (int i = 0; i < ar.length; i++) {
                System.out.print((ar[i] + 1) + " ");
            }
            System.out.println();
            return;
        }

        // 재귀 호출
        for (int i = 0; i < m; i++) {
            ar[p] = i;
            dice(p + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // 주사위 개수
        m = sc.nextInt(); // 주사위 면의 수
        sc.close();

        ar = new int[n]; // 결과를 저장할 배열

        dice(0); // 재귀 호출 시작
    }
}
