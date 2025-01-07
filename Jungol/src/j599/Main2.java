package j599;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); 
        String result = " ";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                if (c >= 'a' && c <= 'z') {
                    c -= 32; // 소문자를 대문자로 변환
                }
                result += c; // 결과 문자열에 추가
            }
        }

        System.out.println(result); // 결과 출력
    }
}