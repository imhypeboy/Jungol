package b25757;

import java.util.HashSet;
import java.util.Scanner;

public class Main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char gameType = sc.next().charAt(0);

        HashSet<String> players = new HashSet<>();
        for (int i = 0; i < N; i++) {
            players.add(sc.next()); 
        }

        int needed = 0;
        if (gameType == 'Y') {
            needed = 1; // 임스 포함 총 2명, => 추가 1명 필요
        } else if (gameType == 'F') {
            needed = 2; // 임스 포함 총 3명, => 추가 2명 필요
        } else if (gameType == 'O') {
            needed = 3; // 임스 포함 총 4명, => 추가 3명 필요
        }

        System.out.println(players.size() / needed);
    }
}
