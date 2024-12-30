package test;

public class GarbageValueExample {

    public static void main(String[] args) {
        // byte 타입 변수 선언 및 초기화
        byte var1 = 125;
        byte var2 = 125;

        // 5번 반복하며 var1, var2 값을 증가시키고 출력
        for (int i = 0; i < 5; i++) {
            var1++; // var1 증가
            var2++; // var2 증가
            System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
        }
    }
}