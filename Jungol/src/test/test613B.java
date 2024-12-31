package test;

import java.util.Scanner;

public class test613B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next(); // 이름
        String school = sc.next(); // 학교
        int grade = sc.nextInt(); // 학년

        sc.close();

        Student stu = new Student(name, school, grade);
        stu.print();
    }
}
