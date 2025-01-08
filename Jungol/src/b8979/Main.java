package b8979;
//입력의 첫 줄은 국가의 수 N(1 ≤ N ≤ 1,000)과 등수를 알고 싶은 국가 K(1 ≤ K ≤ N)가 빈칸을 사이에 두고 주어진다. 
//각 국가는 1부터 N 사이의 정수로 표현된다. 이후 N개의 각 줄에는 차례대로 각 국가를 나타내는 정수와 이 국가가 얻은 금, 은, 동메달의 수가 빈칸을 사이에 두고 주어진다. 전체 메달 수의 총합은 1,000,000 이하이다.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        int[][] medals = new int[n][4];
        for (int i = 0; i < n; i++) {
            medals[i][0] = scanner.nextInt(); // 국가 번호
            medals[i][1] = scanner.nextInt(); // 금메달 수
            medals[i][2] = scanner.nextInt(); // 은메달 수
            medals[i][3] = scanner.nextInt(); // 동메달 수
        }
        
        int[] targetCountry = null;
        for (int[] medal : medals) {
            if (medal[0] == k) {
                targetCountry = medal;
                break;
            }
        }
        
        int rank = 1;
        for (int[] medal : medals) {
            if (medal[1] > targetCountry[1] || 
                (medal[1] == targetCountry[1] && medal[2] > targetCountry[2]) ||
                (medal[1] == targetCountry[1] && medal[2] == targetCountry[2] && medal[3] > targetCountry[3])) {
                rank++;
            }
        }
        
        System.out.println(rank);
    }
}
