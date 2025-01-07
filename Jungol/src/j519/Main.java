	package j519;
	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int a = sc.nextInt();
	        int b = sc.nextInt();

	        a += 100; // 첫 번째 수에 100 증가
	        int r = b % 10; // 두 번째 수를 10으로 나눈 나머지 계산

	        System.out.println(a + " " + r); // 두 값을 차례로 출력
	    }
	}