package test614;

import java.util.Scanner;

class SchoolInfo {
    String schoolName; // 학교명
    int grade;         // 학년

    // 기본 생성자 (초기값 설정)
    public SchoolInfo() {
        this.schoolName = "Jejuelementary";
        this.grade = 6;
    }

    // 사용자 입력을 통해 값 설정
    public void setSchoolInfo(String schoolName, int grade) {
        this.schoolName = schoolName;
        this.grade = grade;
    }

    // 정보 출력
    public void printInfo() {
        System.out.println(grade + " grade in " + schoolName + " School");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 기본 초기값 출력
        SchoolInfo defaultSchool = new SchoolInfo();
        defaultSchool.printInfo();

        // 사용자 입력을 받아 새로운 정보 설정
        System.out.print("");
        String inputSchool = scanner.next(); // 학교 이름 입력 받기
        System.out.print("\n");
        int inputGrade = scanner.nextInt(); // 학년 입력 받기

        // 사용자 입력값 출력
        SchoolInfo inputSchoolInfo = new SchoolInfo();
        inputSchoolInfo.setSchoolInfo(inputSchool, inputGrade);
        inputSchoolInfo.printInfo();

        scanner.close();
    }
}