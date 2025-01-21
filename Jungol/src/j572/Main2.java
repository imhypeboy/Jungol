package j572;

import java.util.Scanner;

public class Main2 {
    // 원의 넓이를 계산하는 메서드
    public double getArea(int r) {
        return r * r * 3.14; // 반지름 * 반지름 * π
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 반지름 입력받기
        int r = sc.nextInt();
        sc.close();

        // Main2 인스턴스 생성
        Main2 m = new Main2();

        // 넓이 계산
        double ret = m.getArea(r);

        // 결과 출력
        System.out.printf("%.2f\n", ret);
    }
}
