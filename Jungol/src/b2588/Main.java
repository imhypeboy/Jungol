package b2588;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int line3 = num1 * (num2 % 10);        
        int line4 = num1 * ((num2 / 10) % 10); // num2의 10의 자리와 곱셈
        int line5 = num1 * (num2 / 100);       // num2의 100의 자리와 곱셈

        int line6 = num1 * num2;

        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
    }
}