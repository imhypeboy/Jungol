package b5073;
//삼각형과 세 변

import java.util.Scanner; // Scanner를 사용하려면 import 필요

public class Main {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); // Scanner 객체 생성

     while (true) { // 반복문을 사용하여 여러 테스트 케이스 처리
         int e = sc.nextInt(); // 첫 번째 변
         int i = sc.nextInt(); // 두 번째 변
         int s = sc.nextInt(); // 세 번째 변

         // 종료 조건
         if (e == 0 && i == 0 && s == 0) {
             break; // 모두 0일 경우 종료
         }

         // 삼각형 조건 확인
         int max = Math.max(e, Math.max(i, s)); // 가장 큰 변
         int sum = e + i + s; // 세 변의 합

         if (max >= sum - max) { // 가장 큰 변 >= 나머지 두 변의 합 -> Invalid
             System.out.println("Invalid");
         } else if (e == i && i == s) { // 세 변이 모두 같으면 Equilateral
             System.out.println("Equilateral");
         } else if (e == i || i == s || e == s) { // 두 변이 같으면 Isosceles
             System.out.println("Isosceles");
         } else { // 나머지 경우 Scalene
             System.out.println("Scalene");
         }
     }

     sc.close(); // Scanner 닫기
 }
}