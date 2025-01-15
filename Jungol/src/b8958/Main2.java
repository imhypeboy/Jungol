package b8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int test_case = Integer.parseInt(br.readLine());

        for (int i = 0; i < test_case; i++) {
            int cnt = 0;
            int sum = 0;

            // OX 문자열을 읽고 처리
            for (byte value : br.readLine().getBytes()) {
                if (value == 'O') { // 'O'를 만난 경우
                    cnt++; // 연속된 점수 증가
                    sum += cnt; // 총점에 추가
                } else { // 'X'를 만난 경우
                    cnt = 0; // 연속 점수 초기화
                }
            }

            sb.append(sum).append('\n'); // 각 테스트 케이스 결과 저장
        }

        System.out.println(sb); // 모든 결과 출력
    }
}
