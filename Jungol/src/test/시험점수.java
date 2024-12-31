package test;

import java.util.Scanner;

public class 시험점수{
	

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * switch (score / 10) {
    case 10: 
    case 9: 
        System.out.println("A");
        break;
    case 8:
        System.out.println("B");
        break;
    case 7:
        System.out.println("C");
        break;	
    case 6:
        System.out.println("D");
        break;
    default:
        System.out.println("F");
}
         */

        // 시험 점수 입력받기
        System.out.print("시험 점수를 입력하세요 (0 ~ 100): ");
        int score = scanner.nextInt();

        // 점수에 따른 성적 계산
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
        } else if (score >= 0 && score < 60) {
            System.out.println("F");
        } else {
            // 입력 값이 범위를 벗어난 경우
            System.out.println("잘못된 점수입니다. 0 ~ 100 사이의 정수를 입력하세요.");
        }

        scanner.close();
    }
}