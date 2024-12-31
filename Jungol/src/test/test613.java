package test;
import java.util.Scanner;

public class test613{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" ");
        String name = scanner.next(); // 이름 

        System.out.print(" ");
        String school = scanner.next(); // 학교

        System.out.print(" ");
        int grade = scanner.nextInt(); // 학년

        // 출력
        System.out.println("\nName : " + name);
        System.out.println("School : " + school);
        System.out.println("Grade : " + grade);

        scanner.close();
    }
}