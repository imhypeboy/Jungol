package java4_p63;
import java.util.Random;
import java.util.random.*;
public class Main {

	public static void main(String[] args) {
		Random rn = new Random();
		rn.setSeed(System.currentTimeMillis());
		
		for (int i= 0; i < 10; i++) {
			double a = rn.nextDouble();
			System.out.printf("%.3f\n", a * 100);
		}
	}

}
