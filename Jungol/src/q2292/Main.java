//벌집 
package q2292;

import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine()); // 입력값 N

        // 중앙(1번째 방)일 경우
        if (N == 1) {
            System.out.println(1);
            return;
        }

        long layer = 1; // 현재 층
        long range = 1; // 현재 층의 마지막 방 번호

        // N이 포함될 층을 찾는다
        while (range < N) {
            range += 6 * layer; // 각 층마다 6 * layer 방이 추가됨
            layer++;
        }

        System.out.println(layer);
    }
}