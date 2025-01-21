package b3052;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> remainders = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int number = sc.nextInt();
            remainders.add(number % 42);
        }

        System.out.println(remainders.size());
        sc.close();
    }
}