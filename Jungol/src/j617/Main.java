package j617;

// 정올 617 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String minName = "";
        int minHeight = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();

            if (height < minHeight) {
                minHeight = height;
                minName = name;
            }
        }

        System.out.println(minName + " " + minHeight);
        sc.close();
    }
}
