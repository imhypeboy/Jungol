package b1205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 현재 랭킹 리스트에 있는 점수 개수
        int newScore = Integer.parseInt(st.nextToken()); // 태수의 새로운 점수
        int P = Integer.parseInt(st.nextToken()); // 최대 랭킹 리스트 크기

        if (N == 0) {
            // 랭킹 리스트가 비어있는 경우 태수는 1등
            System.out.println(1);
            return;
        }

        int[] scores = new int[N]; // 현재 랭킹 리스트 점수 배열
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        int rank = 1; // 태수의 초기 등수
        for (int score : scores) {
            if (newScore < score) {
                rank++; // 태수의 점수가 작으면 등수 증가
            } else {
                break; // 태수의 점수가 현재 점수와 같거나 크면 더 이상 증가하지 않음
            }
        }

        // 랭킹 리스트가 꽉 찼을 때, 태수의 점수가 들어갈 수 없는 경우 처리
        if (N == P && newScore <= scores[N - 1]) {
            System.out.println(-1); // 태수의 점수가 마지막 점수보다 작거나 같으면 들어갈 수 없음
        } else {
            System.out.println(rank); // 태수의 등수 출력
        }
    }
}
