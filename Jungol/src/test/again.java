package test;

public class again {

    public static void main(String[] args) {
        int num = 1; // 초기값 설정

        while (num <= 15) { // 조건: num이 15 이하일 때만 반복
            if (num < 15) {
                System.out.print(num + " "); // 마지막 숫자 외에는 숫자 뒤에 공백 추가
            } else {
                System.out.print(num); // 마지막 숫자는 공백 없이 출력
            }
            num++; // num 값을 1 증가
        }
    }
}