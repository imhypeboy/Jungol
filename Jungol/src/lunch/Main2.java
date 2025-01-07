package lunch;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        String[] lunchOptions = {"맘스터치", "라멘", "파스타", "편의점", "중식", "한식", "주떡", "피자", "햄버거", "샌드위치", "돈까스", "채식"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter"
            		+ "키 를 눌러 멈춰주세요!");

            while (true) {
                int choice = random.nextInt(lunchOptions.length);
                System.out.print("\r오늘의 점심 메뉴: " + lunchOptions[choice] + "\n[Enter 키]를 눌러 멈춰주세요!");

                Thread.sleep(100); // 100ms 간격

                if (System.in.available() > 0) { // 입력 감지
                    scanner.nextLine(); // 입력 대기
                    break;
                }
            }

            System.out.println("\n결정된 메뉴: " + lunchOptions[random.nextInt(lunchOptions.length)]);

            // 다시 돌릴지 묻는 부분 추가
            System.out.print("한 번 더 돌리려면 '1'을 입력하세요. 종료하려면 다른 키를 누르세요: ");
            String input = scanner.nextLine();
            if (!input.equals("1")) {
                System.out.println("점심 메뉴 추천을 종료합니다. 맛있게 드세요!");
                break;
            }
        }
    }
}