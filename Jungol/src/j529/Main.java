//선택제어문 - 자가진단2 #529
//몸무게 = kg
//키 = h
package j529;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // 키와 몸무게 입력받기
     int h = sc.nextInt(); // 키
     int kg = sc.nextInt(); // 몸무게

     // 비만수치 계산
     int obesityIndex = kg + 100 - h;

     // 비만수치 출력
     System.out.println(obesityIndex);

     // 비만 여부 판단 후 출력
     if (obesityIndex > 0) {
         System.out.println("Obesity");
     }

     sc.close();
 }
}