package j530;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int age = sc.nextInt();
		 sc.close();
		 
		 System.out.println(age);
		 
		 if(age>=20) {
			 
			 System.out.println("adult");
			 
		 } else {
			 System.out.println((20-age) + "years later");
	
		 }
	}
	

}
