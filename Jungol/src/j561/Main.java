package j561;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inp = new int[10];

        // 입력받기
        for (int i = 0; i < inp.length; i++) {
            inp[i] = sc.nextInt();
        }

        sc.close();

        // 최대, 최소 값 찾기 (초기값 설정)
        int max = -1; // 100 미만에서 가장 큰 수 찾기
        int min = 10001; // 100 이상에서 가장 작은 수 찾기

        for (int i = 0; i < inp.length; i++) {
            if (inp[i] < 100 && inp[i] > max) {
                max = inp[i];
            }
            if (inp[i] >= 100 && inp[i] < min) {
                min = inp[i];
            }
        }

        // 조건에 맞는 값이 없을 경우 100 출력
        if (max == -1) {
            max = 100;
        }
        if (min == 10001) {
            min = 100;
        }

        System.out.println(max + " " + min);
    }
}
