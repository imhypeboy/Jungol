package q2588;

/*import java.util.Scanner;

public class gob{ 
	static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.print("");

	}
} */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int num1 = scanner.nextInt(); // 첫 번째 세 자리 수
        int num2 = scanner.nextInt(); // 두 번째 세 자리 수

        int thirdRow = num1 * (num2 % 10);           // (5)에 해당
        int fourthRow = num1 * ((num2 / 10) % 10);   // (4)에 해당
        int fifthRow = num1 * (num2 / 100);          // (3)에 해당

        int finalResult = num1 * num2;              // (6)에 해당

        System.out.println(thirdRow);
        System.out.println(fourthRow);
        System.out.println(fifthRow);
        System.out.println(finalResult);

        scanner.close();
    }
}