package java5.p23;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("서울시", "중부", "기술", "교육원");
        for (String name : list1) {
            System.out.print(name + " ");
        }
        System.out.println();

        // list1.add(2, "남부"); // Exception 발생

        List<Integer> list2 = Arrays.asList(4, 3, 8, 1, 9, 12);
        for (int value : list2) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
