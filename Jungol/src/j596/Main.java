package j596;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        String text = parts[0];
        int n = Integer.parseInt(parts[1]);
        sc.close();

        if (n > text.length()) {
            System.out.println(new StringBuilder(text).reverse().toString());
        } else {
            System.out.println(new StringBuilder(text.substring(text.length() - n)).reverse().toString());
        }
    }
}
/* 문자열을 입력받고 정수를 입력 받아서 문자열의 맨 뒤부터 정수만큼 출력하는 프로그램을 작성하시오.

 만약 입력받은 정수가 문자열의 길이보다 크다면 맨 뒤부터 맨 처음까지 모두 출력한다.

(문자열 길이는 최대 100자 이하이다 */