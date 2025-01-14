package jungall111;

import java.util.Scanner;


/*
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 과목 점수 입력
        System.out.print("국어, 영어, 수학, 컴퓨터 점수를 입력하세요: ");
        int korean = scanner.nextInt();
        int english = scanner.nextInt();
        int math = scanner.nextInt();
        int computer = scanner.nextInt();

        // 총점 계산
        int total = korean + english + math + computer;

        // 평균 계산 (소수점 이하 버림)
        int average = total / 4;

        // 결과 출력
        System.out.println("총점: " + total);
        System.out.println("평균: " + average);

        scanner.close();
    }
}
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		
		int korScore = sc.nextInt();
		int EngScore = sc.nextInt();
		int mathScore = sc.nextInt();
		int comScore = sc.nextInt();
		
		int sum = korScore + EngScore + mathScore + comScore;
		int avg = sum / 4;
		
		System.out.println("sum " + sum);
		System.out.println("avg " + avg);
		
		sc.close();
}
}

       