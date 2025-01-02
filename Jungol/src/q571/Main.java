package q571;

import java.util.Scanner;

public class Main {
    // 문자열을 출력하는 함수
    public static void printSpecialString() {
        System.out.println("~!@#$^&*()_+|");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력 받기
        System.out.print("");
        int n = scanner.nextInt();

        // 입력받은 수만큼 함수 호출
        for (int i = 0; i < n; i++) {
            printSpecialString();
        }

        scanner.close();
    }
}