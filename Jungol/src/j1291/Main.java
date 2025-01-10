package j1291;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int s = sc.nextInt();
            int e = sc.nextInt();

            if (s < 2 || s > 9 || e < 2 || e > 9) {
                System.out.println("INPUT ERROR!");
                continue;             }

            printGugudan(s, e);
            break; 
        }

        sc.close();
    }

    public static void printGugudan(int s, int e) {
        if (s <= e) {
            for (int i = 1; i <= 9; i++) {
                for (int j = s; j <= e; j++) {
                    System.out.printf("%d * %d = %2d", j, i, j * i);
                    if (j < e) {
                        System.out.print("   "); 
                    }
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= 9; i++) {
                for (int j = s; j >= e; j--) {
                    System.out.printf("%d * %d = %2d", j, i, j * i);
                    if (j > e) {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }
    }
}

/*원하는 구구단의 범위를 입력받아 해당 구간의 구구단을 출력하는 프로그램을 작성하시오.



[처리조건]

(1) 구간의 처음과 끝을 입력받는다. 

(2) 입력된 구간은 반드시 처음 입력 값이 끝의 입력 값보다 작아야 하는 것은 아니다.

    즉, 입력된 구간의 범위는 증가하거나 감소하는 순서 그대로 출력되어야 한다.​  */

/* 구구단의 시작 범위 s,와 끝 범위 e를 입력받는다.





s와 e는 2부터 9사이의 정수가 입력되어야 하며, 입력된 값이 주어진 범위를 벗어날 경우는 INPUT ERROR!를 출력하고 s와 e를 다시 입력받는다.



입력은 여러 번 주어질 수도 있다.

하나의 결과가 출력되면 프로그램을 종료한다. */
//입력
/*1 6
11 5
9 6 */

//출력

/*INPUT ERROR!
INPUT ERROR!
9 * 1 =  9   8 * 1 =  8   7 * 1 =  7   6 * 1 =  6
9 * 2 = 18   8 * 2 = 16   7 * 2 = 14   6 * 2 = 12
9 * 3 = 27   8 * 3 = 24   7 * 3 = 21   6 * 3 = 18
9 * 4 = 36   8 * 4 = 32   7 * 4 = 28   6 * 4 = 24
9 * 5 = 45   8 * 5 = 40   7 * 5 = 35   6 * 5 = 30
9 * 6 = 54   8 * 6 = 48   7 * 6 = 42   6 * 6 = 36
9 * 7 = 63   8 * 7 = 56   7 * 7 = 49   6 * 7 = 42
9 * 8 = 72   8 * 8 = 64   7 * 8 = 56   6 * 8 = 48
9 * 9 = 81   8 * 9 = 72   7 * 9 = 63   6 * 9 = 54 */