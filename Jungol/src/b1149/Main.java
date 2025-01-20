package b1149;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] cost = new int[n][3];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cost[i][0] = Integer.parseInt(st.nextToken()); // 빨강 비용
            cost[i][1] = Integer.parseInt(st.nextToken()); // 초록 비용
            cost[i][2] = Integer.parseInt(st.nextToken()); // 파랑 비용
        }

        // 이전 상태를 저장할 변수
        int prevRed = cost[0][0];
        int prevGreen = cost[0][1];
        int prevBlue = cost[0][2];

        // 두 번째 집부터 마지막 집까지 처리
        for (int i = 1; i < n; i++) {
            int currRed = cost[i][0] + Math.min(prevGreen, prevBlue);
            int currGreen = cost[i][1] + Math.min(prevRed, prevBlue);
            int currBlue = cost[i][2] + Math.min(prevRed, prevGreen);

            // 이전 값을 현재 값으로 업데이트
            prevRed = currRed;
            prevGreen = currGreen;
            prevBlue = currBlue;
        }

        // 마지막 집에서 최소 비용 출력
        int result = Math.min(prevRed, Math.min(prevGreen, prevBlue));
        System.out.println(result);
    }
}
