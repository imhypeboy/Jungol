package java5.p32;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new LinkedList<String>();

        long timeStart;
        long timeEnd;

        // ArrayList 측정
        timeStart = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        timeEnd = System.nanoTime();
        System.out.println("ArrayList 걸린 시간: " + formatNumber(timeEnd - timeStart) + " ns");

        // LinkedList 측정
        timeStart = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        timeEnd = System.nanoTime();
        System.out.println("LinkedList 걸린 시간: " + formatNumber(timeEnd - timeStart) + " ns");
    }

    // 숫자를 세 자리마다 콤마로 구분하는 메서드
    public static String formatNumber(long number) {
        return NumberFormat.getInstance().format(number);
    }
}
