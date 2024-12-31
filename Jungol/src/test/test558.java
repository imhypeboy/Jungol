package test;

import java.util.Scanner;

public class test558 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[100];
        int count = 0;

        // 입력 및 배열 저장
        for (int num; (num = scanner.nextInt()) != 0; ) {
            numbers[count++] = num;
        }

        // 역순 출력
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}