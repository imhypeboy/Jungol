package random;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받기
        int diceCount = sc.nextInt(); // 주사위 개수
        int faceCount = sc.nextInt(); // 주사위 면의 수

        // 모든 경우의 수를 저장할 배열
        int[] result = new int[diceCount];

        // 주사위 개수에 따라 반복문으로 처리
        for (int i = 1; i <= faceCount; i++) {
            result[0] = i; // 첫 번째 주사위 값 설정
            for (int j = 1; j <= faceCount; j++) {
                if (diceCount > 1) { // 두 번째 주사위 값이 있다면
                    result[1] = j;
                }
                if (diceCount == 2) {
                    System.out.println(result[0] + " " + result[1]);
                }
            }
        }
    }
}
