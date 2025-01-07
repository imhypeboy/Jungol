//벌집 
package q2292;

import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine()); // 입력값 N

        if (N == 1) {
            System.out.println(1);
            return;
        }

        long layer = 1; 
        long range = 1;

        while (range < N) {
            range += 6 * layer; 
            layer++;
        }

        System.out.println(layer);
    }
}