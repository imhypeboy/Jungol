package test;

import java.util.Scanner;

public class test9069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("YEAR = ");
            int year = scanner.nextInt();
            System.out.print("MONTH = ");
            int month = scanner.nextInt();

            if (year == 0 && month == 0) {
                System.out.println("TYPE AGAIN CORRECTLY!!");
                break;
            }

            // 입력값 검증
            if (month < 1 || month > 12) {
                System.out.println("잘못 입력하였습니다.");
                continue;
            }

            // 월별 날 수 계산
            int days;
            switch (month) {
                case 2: // 2월
                    days = isLeapYear(year) ? 29 : 28;
                    break;
                case 4: case 6: case 9: case 11: // 30일인 달
                    days = 30;
                    break;
                default: // 31일인 달
                    days = 31;
            }

            // 결과 출력
            System.out.println("입력하신 달의 날 수는 " + days + "일입니다.\n");
        }

        scanner.close(); // 스캐너 닫기
    }

    // 윤년 여부를 계산하는 메서드
    private static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true; // 400의 배수는 윤년
        }
        if (year % 100 == 0) {
            return false; // 100의 배수는 평년
        }
        return year % 4 == 0; // 4의 배수는 윤년
    }
}