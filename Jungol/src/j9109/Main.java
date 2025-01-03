 //문자열1 - 연습문제2_1 #9109
package j9109;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder();

        while (true) {
            String line = sc.nextLine();
            if (line.isEmpty()) {
                // 빈 줄(엔터) 입력 시 저장된 모든 문자 출력 후 종료
                System.out.println(input.toString());
                break;
            }
            // 입력받은 문자 추가
            input.append(line);
        }

        sc.close();
    }
}