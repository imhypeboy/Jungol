package b3040;
//백설공주 와 일곱난쟁이
/* 
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;  //9 난쟁이의 숫자 합
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                int current = arr[i] + arr[j];
                //두 난쟁이의 숫자를 합에서 뺐을 때 100이 될 때
                if (sum - current == 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) System.out.println(arr[k]);
                    }
                }
            }
        }
    }
} */

import java.io.*;
import java.util.*;

public class Main {
    static int[] arr = new int[9];
    static int[] selected = new int[7]; // 7명의 난쟁이를 선택하기 위한 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 9명의 난쟁이 키 입력받기
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        // 백트래킹 탐색 시작
        backtrack(0, 0, 0);
    }

    static void backtrack(int start, int depth, int sum) {
        // 7명을 선택했을 때
        if (depth == 7) {
            // 선택된 난쟁이들의 합이 100인 경우 출력
            if (sum == 100) {
                for (int i = 0; i < 7; i++) {
                    System.out.println(selected[i]);
                }
                System.exit(0); // 정답을 찾았으니 프로그램 종료
            }
            return;
        }

        // 백트래킹 탐색
        for (int i = start; i < 9; i++) {
            selected[depth] = arr[i]; // 현재 난쟁이를 선택
            backtrack(i + 1, depth + 1, sum + arr[i]); // 다음 난쟁이를 선택
        }
    }
}