package random;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diceCount = sc.nextInt(); // 주사위 개수
        int faceCount = sc.nextInt(); // 주사위 면의 수

        int[] result = new int[diceCount]; // 결과 저장 배열
        printCombinations(result, diceCount, faceCount, 0); // 경우의 수 출력 시작
    }

    // 재귀적으로 모든 경우의 수를 출력하는 메서드
    public static void printCombinations(int[] result, int diceCount, int faceCount, int depth) {
        if (depth == diceCount) { // 주사위를 다 굴렸으면 출력
            for (int value : result) {
                System.out.print(value + " ");
            }
            System.out.println(); // 줄바꿈
            return;
        }

        for (int i = 1; i <= faceCount; i++) { // 현재 주사위의 모든 면 탐색
            result[depth] = i; // 현재 깊이에 해당하는 값 저장
            printCombinations(result, diceCount, faceCount, depth + 1); // 다음 주사위로 이동
        }
    }
}

/* 주사위 개수와 면의 수를 입력받아 해당 주사위로  만들수 있는 모든 경우의 수를 출력하는 프로그램을 작성하시오.  */
/* 입력:2 3
출력:1 1
	1 2
	1 3
	2 1
	2 2
	2 3
	3 1
	3 2
	3 3 */