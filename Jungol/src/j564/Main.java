package j564;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = 0;
        }
        while (true) {
            char ch = sc.next().charAt(0);
            if (ch < 'A' || ch > 'Z')
                break;
            arr[(int) ch - 65]++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                System.out.print((char) (int) (i + 65) + " : ");
                System.out.println(arr[i]);
            }
        }
    }
}