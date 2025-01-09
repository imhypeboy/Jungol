package random_lunch;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String[] lunchOptions = {
            "맘스터치","토리코코로","몽키파스타","편의점","홍원","주떡","돈까스","청와삼대",
            "세상만사감자탕(뼈해장국)","바글바글","꿈떡","중국관","창부리또","하늘지기","쌀국수공방",
            "스마일닭갈비","다람이임자탕(채식)","최고집해물찜칼국수","후참잘","신룽푸마라탕",
            "담터추어탕(잔치국수, 비빔국수)","담터쭈꾸미(쭈꾸미+비빔밥+피자+샐러드세트)","배달"
        };
        Random random = new Random();
        System.out.println("엔터를 누르면 메뉴 선택을 멈춥니다.");

        Stopper stopper = new Stopper();
        stopper.start();

        while (!stopper.isStopped()) {
            int choice = random.nextInt(lunchOptions.length);
            System.out.print("\r오늘의 점심 메뉴: " + lunchOptions[choice]);
            Thread.sleep(100);
        }

        System.out.println("\n결정된 메뉴: " + lunchOptions[random.nextInt(lunchOptions.length)]);
    }

    static class Stopper extends Thread {
        private volatile boolean stopped = false;
        @Override
        public void run() {
            new Scanner(System.in).nextLine();
            stopped = true;
        }
        public boolean isStopped() {
            return stopped;
        }
    }
}
