package soju;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("🍶 당신의 주량을 테스트합니다. 🍶");
        System.out.print("오늘 예상 주량 (소주 몇 병 가능?) >> ");
        int bottles = sc.nextInt();
        sc.close();

        int baseTolerance = bottles / 2 + rand.nextInt(2); // 기본 주량은 예상의 절반 + 랜덤 0~1병 추가  
        int maxTolerance = bottles + rand.nextInt(2); // 최대 주량은 입력값 ±1병  

        System.out.println("\n🥃 술 마시는 중... 🥃");

        for (int i = 1; i <= bottles; i++) {
            int drunkLevel = rand.nextInt(10) + i; // 병이 늘어날수록 취할 확률 증가

            if (i >= baseTolerance && drunkLevel < 5) { 
                System.out.println("🤢 " + i + "병째 → 알딸딸... 코드 오류 발생 🚨");
                System.out.println("💤 기억이 사라짐... 강제 종료 💤");
                return;
            } else if (i >= maxTolerance) { 
                System.out.println("💀 " + i + "병째 → ⚠️ 위기 상황! 이대로 가면 위험함! 🚨");
                System.out.println("🚑 응급실행... 프로그램 종료... 🚑");
                return;
            } else {
                System.out.println("🍻 " + i + "병째 → 멀쩡함 😎 (코딩 가능!)");
            }
        }

        System.out.println("\n🔥 오!" + bottles + "병을 마셔도 멀쩡하다! 🔥");
        System.out.println("🚀 술코딩 가능! 커밋 메시지: '술기운이 살짝 남은 코드입니다...🍻'");
    }
}
