package b11723;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입출력을 위해 BufferedReader / BufferedWriter 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine()); // 연산의 수
        int S = 0; // 비트마스크로 관리할 집합 (0이면 공집합)

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            // add, remove, check, toggle 명령은 뒤에 x가 붙음
            if (cmd.equals("add")) {
                int x = Integer.parseInt(st.nextToken());
                // x번째 비트를 1로 켠다
                S |= (1 << (x - 1));

            } else if (cmd.equals("remove")) {
                int x = Integer.parseInt(st.nextToken());
                // x번째 비트를 0으로 만든다
                S &= ~(1 << (x - 1));

            } else if (cmd.equals("check")) {
                int x = Integer.parseInt(st.nextToken());
                // x번째 비트가 켜져 있으면 1, 꺼져 있으면 0
                int result = (S & (1 << (x - 1))) != 0 ? 1 : 0;
                bw.write(result + "\n");

            } else if (cmd.equals("toggle")) {
                int x = Integer.parseInt(st.nextToken());
                // x번째 비트를 반전 (켜져 있으면 끄고, 꺼져 있으면 켠다)
                S ^= (1 << (x - 1));

            } else if (cmd.equals("all")) {
                // 1부터 20까지 모두 켠 상태
                S = (1 << 20) - 1;

            } else if (cmd.equals("empty")) {
                // 공집합
                S = 0;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}