package j1856;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int n = sc.nextInt();
        int m = sc.nextInt();
         
        int[][] numArr = new int[n][m];
         
        int num = 1;
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                for(int j = 0; j < m; j++) {
                    numArr[i][j] = num++;
                }
            } else {
                for(int j = m-1; j >= 0; j--) {
                    numArr[i][j] = num++;
                }
            }
        }
         
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(numArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}