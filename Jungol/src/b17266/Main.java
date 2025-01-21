package b17266;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int n = sc.nextInt(); // 굴다리의 길이
        int m = sc.nextInt(); // 가로등 개수
        int[] positions = new int[m];
        for (int i = 0; i < m; i++) {
            positions[i] = sc.nextInt(); // 가로등 위치
        }

        // 이분 탐색으로 최소 높이 찾기
        int left = 1, right = n; // 최소 높이: 1, 최대 높이: 굴다리 길이
        int result = n;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (canIlluminateAll(positions, n, mid)) {
                result = mid; // 조건을 만족하면 높이를 더 낮춰본다
                right = mid - 1;
            } else {
                left = mid + 1; // 조건을 만족하지 못하면 높이를 높인다
            }
        }

        System.out.println(result);
    }

    // 주어진 높이로 굴다리 전체를 비출 수 있는지 확인
    private static boolean canIlluminateAll(int[] positions, int n, int height) {
        int covered = 0; // 현재까지 비춘 마지막 위치

        for (int pos : positions) {
            if (pos - height > covered) {
                // 비출 수 없는 구간이 존재
                return false;
            }
            covered = pos + height; // 현재 가로등이 비추는 구간 업데이트
        }

        return covered >= n; // 굴다리 끝까지 비출 수 있는지 확인
    }
}

/*
인하대학교 후문 뒤쪽에는 어두운 굴다리가 있다. 겁쟁이 상빈이는 길이 조금이라도 어둡다면 가지 않는다. 따라서 굴다리로 가면 최단거리로 집까지 갈수 있지만, 굴다리는 어둡기 때문에 빙빙 돌아서 집으로 간다. 안타깝게 여긴 인식이는 굴다리 모든 길 0~N을 밝히게 가로등을 설치해 달라고 인천광역시에 민원을 넣었다. 인천광역시에서 가로등을 설치할 개수 M과 각 가로등의 위치 x들의 결정을 끝냈다. 그리고 각 가로등은 높이만큼 주위를 비출 수 있다. 하지만 갑자기 예산이 부족해진 인천광역시는 가로등의 높이가 높을수록 가격이 비싸지기 때문에 최소한의 높이로 굴다리 모든 길 0~N을 밝히고자 한다. 최소한의 예산이 들 높이를 구하자. 단 가로등은 모두 높이가 같아야 하고, 정수이다.



입력
첫 번째 줄에 굴다리의 길이 N 이 주어진다. (1 ≤ N ≤ 100,000)

두 번째 줄에 가로등의 개수 M 이 주어진다. (1 ≤ M ≤ N)

다음 줄에 M 개의 설치할 수 있는 가로등의 위치 x 가 주어진다. (0 ≤ x ≤ N)

가로등의 위치 x는 오름차순으로 입력받으며 가로등의 위치는 중복되지 않으며, 정수이다.

출력
굴다리의 길이 N을 모두 비추기 위한 가로등의 최소 높이를 출력한다.

예제 입력 1 
5
2
2 4
예제 출력 1 
2
*/