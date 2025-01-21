package j572;

import java.util.Scanner;

public class Main {

    public static double call(int input) {
        return input * input * 3.14; // 원의 넓이를 계산하는 식
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int radius = in.nextInt(); // 반지름 입력 받기

        System.out.printf("%.2f", call(radius)); // 결과 출력

        in.close(); // Scanner 닫기
    }
}
