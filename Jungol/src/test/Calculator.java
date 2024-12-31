package test;

public class Calculator {
    // 정수 덧셈
    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    // 실수 덧셈
    double plus(double x, double y) {
        double result = x + y;
        return result;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        // 정수 덧셈
        int res1 = myCalculator.plus(5, 10);

        // 실수 덧셈
        double res2 = myCalculator.plus(10.5, 20.3);

        // 결과 출력
        System.out.println(res1);
        System.out.println(res2);
    }
}