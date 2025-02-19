package j573;

import java.util.Scanner;

public class Main {
	public static void square(int n){
		if( 0 < n && n < 100) {
			for(int i = 1; i <= n * n; i++){
				System.out.print(i + " ");
				
				if(i % n == 0) {
					System.out.println(" ");
				}
			}	
		}		
	}

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		square(n);
	}
}