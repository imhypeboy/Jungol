package test;
import java.util.Scanner;

public class test613 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 이름, 학교명, 학년 입력받기
        System.out.print(" ");
        String name = scanner.next(); // 이름 입력

        System.out.print(" ");
        String school = scanner.next(); // 학교명 입력

        System.out.print(" ");
        int grade = scanner.nextInt(); // 학년 입력

        // 출력
        System.out.println("\nName   : " + name);
        System.out.println("School : " + school);
        System.out.println("Grade  : " + grade);

        scanner.close(); // 스캐너 닫기
    }
}