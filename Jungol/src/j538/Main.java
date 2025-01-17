package j538;
//반복제어문1 - 자가진단3 538
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num=0;
		
		while(true) {
			System.out.print("number? ");
			num =sc.nextInt();
			
			if(num>0) {
				System.out.println("positive integer");
			}
			else if(num<0) {
				System.out.println("negative number");
			}else {
				break;
			}
		}
		sc.close();
	}

}
/*
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(true) {
			System.out.print("number? ");
			num = sc.nextInt();
			if(num>0) {
				System.out.println("positive integer");
			}else if(num<0){
				System.out.println("negative number");
			}else {
				break;
			}
		}
	}
} */