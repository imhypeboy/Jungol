package j599;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                result.append(Character.toUpperCase(c));
            }
        }

        System.out.println(result.toString());
    }
}
