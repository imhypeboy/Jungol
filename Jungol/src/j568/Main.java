package j568;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a1 = new int[2][4];
        int[][] a2 = new int[2][4];

        System.out.println("first array");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 4; j++)
                a1[i][j] = sc.nextInt();

        System.out.println("second array");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 4; j++)
                a2[i][j] = sc.nextInt();

        sc.close();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print((a1[i][j] * a2[i][j]) + " ");
            System.out.println();
        }
    }
} 
