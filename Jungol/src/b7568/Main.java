import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] people = new int[n][2];
        for (int i = 0; i < n; i++) {
            people[i][0] = scanner.nextInt();
            people[i][1] = scanner.nextInt();
        }
        int[] ranks = new int[n];
        Arrays.fill(ranks, 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    ranks[i]++;
                }
            }
        }
        for (int rank : ranks) {
            System.out.print(rank + " ");
        }
    }
}
