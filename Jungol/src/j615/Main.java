package j615;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        String name1 = sc.next();
        int score1_1 = sc.nextInt();
        int score1_2 = sc.nextInt();

        String name2 = sc.next();
        int score2_1 = sc.nextInt();
        int score2_2 = sc.nextInt();

        sc.close();

        // 평균 계산
        int avg1 = (score1_1 + score2_1) / 2;
        int avg2 = (score1_2 + score2_2) / 2;

        // 출력
        System.out.println(name1 + " " + score1_1 + " " + score1_2);
        System.out.println(name2 + " " + score2_1 + " " + score2_2);
        System.out.println("avg " + avg1 + " " + avg2);
    }
}