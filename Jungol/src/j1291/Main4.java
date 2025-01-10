package j1291;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start, end, step = 1;

        // 입력 검증 루프
        do {
            start = scan.nextInt();
            end = scan.nextInt();
            if (start < 2 || start > 9 || end < 2 || end > 9) {
                System.out.println("INPUT ERROR!");
            }
        } while (start < 2 || start > 9 || end < 2 || end > 9);

        // 방향 설정
        if (start > end) {
            step = -1;
        }

        // 구구단 출력
        for (int n = 1; n <= 9; n++) {
            for (int i = start; i != end + step; i += step) {
                System.out.printf("%d * %d = %2d", i, n, i * n);
                if (i != end) {
                    System.out.print("   "); // 구구단 사이 공백 추가
                }
            }
            System.out.println(); // 줄바꿈
        }

        scan.close();
    }
}