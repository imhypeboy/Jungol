package java5.p53;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(new Integer(87), "홍길동");
        scores.put(new Integer(98), "이동수");
        scores.put(new Integer(75), "박길순");
        scores.put(new Integer(95), "신용권");
        scores.put(new Integer(80), "김자바");

        Map.Entry<Integer, String> entry = null;

        entry = scores.firstEntry();
        System.out.println("가장 낮은 점수 : " + entry.getKey() + "-" + entry.getValue());

        entry = scores.lastEntry();
        System.out.println("가장 높은 점수 : " + entry.getKey() + "-" + entry.getValue() + "\n");

        entry = scores.lowerEntry(new Integer(95));
        System.out.println("95점 아래 점수 : " + entry.getKey() + "-" + entry.getValue());

        entry = scores.higherEntry(new Integer(95));
        System.out.println("95점 위의 점수 : " + entry.getKey() + "-" + entry.getValue() + "\n");

        entry = scores.floorEntry(new Integer(95));
        System.out.println("95점 이거나 바로 아래 점수 : " + entry.getKey() + "-" + entry.getValue());

        entry = scores.ceilingEntry(new Integer(85));
        System.out.println("85점 이거나 바로 위의 점수 : " + entry.getKey() + "-" + entry.getValue() + "\n");

        while (!scores.isEmpty()) {
            entry = scores.pollFirstEntry(); // 앞에 껄 꺼내면서 조회
            System.out.println(entry.getKey() + "-" + entry.getValue() + " (남은 객체 수 : " + scores.size() + ")");
        }
    }
}
