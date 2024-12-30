package test;

import java.util.Scanner;

public class 선택제어문{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 입력받기
        System.out.print("정수를 입력하세요: ");
        int number = scanner.nextInt();

        // 첫 번째 줄에 입력받은 숫자 출력
        System.out.println(number);

        // 두 번째 줄에 음수 여부 확인 후 출력
        if (number < 0) {
            System.out.println("minus");
        }

        scanner.close();
    }
}