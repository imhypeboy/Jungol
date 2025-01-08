package baseball;
import java.util.Scanner;

public class Main{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int[] com = new int[3];
      int[] user = new int[3];
      int strike = 0;
      int ball = 0;
      
      // 난수 생성
      for (int i = 0; i <= 2; i++) {
         com[i] = (int) (Math.random() * 10);
         
         for (int j = 0; j < i; j++) {
            if (com[i] == com[j]) {
               i--;
               break;
            }
         }
      }
      
      //스트라이크 볼 판정
      while(strike < 3) {
         strike = 0;
         ball = 0;
         for(int i = 0; i < 3; i++) {
            System.out.print(i+1 + "번째 자리숫자 : ");
            user[i] = sc.nextInt();
         }
         
         // 3strike
         if(com[0] == user[0] && com[1] == user[1] && com[2] == user[2]) {
            strike = 3;
            System.out.println("홈런!");
            break;
         }
         
         //strike
         if(com[0] == user[0]) {
            strike++;
         }
         
         if(com[1] == user[1]) {
            strike++;
         }
         
         if(com[2] == user[2]) {
            strike++;
         }
         
         // ball
         if(user[0] == com[1] || user[0] == com[2]) {
            ball++;
         }
         
         if(user[1] == com[0] || user[1] == com[2]) {
            ball++;
         }
         
         if(user[2] == com[0] || user[2] == com[1]) {
            ball++;
         }
         
         // OUT
         else if(ball == 0 && strike == 0) {
            System.out.println("OUT");
            continue;
         }
         
         // 스트라이크 볼 출력
         System.out.println(strike + " 스트라이크, " + ball + " 볼");   
      }
      sc.close();
   }
}
