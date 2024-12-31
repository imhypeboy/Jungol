package q614;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자 입력 받기
        String schoolName = sc.next();
        int grade = sc.nextInt();
        sc.close();

        // Student 객체 생성 및 초기화
        Student st1 = new Student();
        st1.setSchoolName("Jejuelementary");
        st1.setGrade(6);

        Student st2 = new Student();
        st2.setSchoolName(schoolName);
        st2.setGrade(grade);

        // 결과 출력
        st1.print();
        st2.print();
    }
}