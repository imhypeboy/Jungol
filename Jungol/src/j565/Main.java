package j565;
import java.util.Scanner;

public class Main {



 public static void main(String args[]) {

 Scanner in = new Scanner(System.in);

 int[] count = new int[10];

 String input = in.nextLine();

 String[] temp = input.split(" ");

 int[] arr = new int[temp.length];

 int quant;

 for (int i = 0; i < temp.length; i++) {

 arr[i] = Integer.parseInt(temp[i]);

 }

 for (int i = 0; i < temp.length; i++) {

 if (arr[i] != 0) {

 quant = arr[i] / 10;

 count[quant]++;

 }

 }

 for (int i = 0; i < count.length; i++) {

 if (count[i] != 0) {

 System.out.println(i + " : " + count[i]);

 }

 }

 }

}
/*public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for ( int i =0; i<= 100) {
			
			if(i ==0)
				count +=
		}
	}
} */


/*100 미만의 양의 정수들이 주어진다. 

입력받다가 0 이 입력되면 마지막에 입력된 0 을 제외하고 

그 때까지 입력된 정수의 십의 자리 숫자가 각각 몇 개인지 

작은 수부터 출력하는 프로그램을 작성하시오. (0개인 숫자는 출력하지 않는다.)*/