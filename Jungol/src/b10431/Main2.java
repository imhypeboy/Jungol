package b10431;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        int len = sc.nextInt();
        sc.close();

        System.out.println(str + " " + len);

        if (str.length() > len) {
            for (int i = str.length() - 1; len > 0; i--, len--) {
                System.out.print(str.charAt(i));
            }
        } else {
            StringBuilder reversed = new StringBuilder(str).reverse();
            System.out.println(reversed);
        }
    }
}