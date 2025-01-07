package lunch;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        String[] lunchOptions = {"맘스터치", "라멘", "파스타", "편의점", "중식", "한식", "주떡", "피자", "햄버거", "샌드위치","돈까스","채식"};

        Random random = new Random();
        int choice = random.nextInt(lunchOptions.length);

        System.out.println("오늘의 점심 메뉴: " + lunchOptions[choice]);
        return;

    }
}