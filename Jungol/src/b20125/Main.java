package b20125;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] grid = new char[N][N];

        for (int i = 0; i < N; i++) {
            grid[i] = br.readLine().toCharArray();
        }

        int heartX = 0, heartY = 0;

        // 심장 위치 찾기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == '*') {
                    if (i + 1 < N && grid[i + 1][j] == '*') {
                        heartX = i + 1; // 1-based index
                        heartY = j + 1;
                        break;
                    }
                }
            }
            if (heartX != 0) break;
        }

        int leftArm = 0, rightArm = 0, waist = 0, leftLeg = 0, rightLeg = 0;

        // 왼쪽 팔 길이
        for (int j = heartY - 2; j >= 0; j--) {
            if (grid[heartX - 1][j] == '*') {
                leftArm++;
            } else break;
        }

        // 오른쪽 팔 길이
        for (int j = heartY; j < N; j++) {
            if (grid[heartX - 1][j] == '*') {
                rightArm++;
            } else break;
        }

        // 허리 길이
        for (int i = heartX; i < N; i++) {
            if (grid[i][heartY - 1] == '*') {
                waist++;
            } else break;
        }

        // 왼쪽 다리 길이
        for (int i = heartX + waist; i < N; i++) {
            if (grid[i][heartY - 2] == '*') {
                leftLeg++;
            } else break;
        }

        // 오른쪽 다리 길이
        for (int i = heartX + waist; i < N; i++) {
            if (grid[i][heartY] == '*') {
                rightLeg++;
            } else break;
        }

        // 출력
        System.out.println(heartX + " " + heartY);
        System.out.println(leftArm + " " + rightArm + " " + waist + " " + leftLeg + " " + rightLeg);
    }
}
