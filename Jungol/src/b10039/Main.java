package b10039;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // 평균 점수 계산
    int averageScore = calculateAverageScore(sc);
    
    // 출력
    System.out.println(averageScore);
  }
  
  // 평균 점수를 계산하는 메서드
  private static int calculateAverageScore(Scanner sc) {
    int totalScore = 0;
    int numStudents = 5;
    
    // 학생 점수 입력받기
    for (int i = 0; i < numStudents; i++) {
      int score = sc.nextInt();
      // 40점 미만인 경우 40점으로 조정
      if (score < 40) {
        score = 40;
      }
      
      // 총 점수에 더하기
      totalScore += score;
    }
    
    // 평균 점수 계산 후 반환
    return totalScore / numStudents;
  }
}