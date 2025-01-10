package b25757;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 신청 횟수
        char gameType = sc.next().charAt(0); // 게임 종류
        sc.nextLine(); // 개행 문자 처리

        // 중복되지 않은 플레이어를 저장할 HashSet
        HashSet<String> players = new HashSet<>();

        // 사람들의 이름 입력 처리
        for (int i = 0; i < N; i++) {
            players.add(sc.nextLine());
        }

        // 게임에 필요한 최소 인원 계산
        int minPlayers = 0;
        if (gameType == 'Y') {
            minPlayers = 2;
        } else if (gameType == 'F') {
            minPlayers = 3;
        } else if (gameType == 'O') {
            minPlayers = 4;
        }

        // 최대 게임 횟수 계산
        int maxGames = players.size() / minPlayers;
        System.out.println(maxGames);

        sc.close();
    }
}

/*임스가 미니게임을 같이할 사람을 찾고 있습니다.

플레이할 미니게임으로는 윷놀이 
Y, 같은 그림 찾기 
F, 원카드 
O가 있습니다. 각각 2, 3, 4 명이서 플레이하는 게임이며 인원수가 부족하면 게임을 시작할 수 없습니다.

사람들이 임스와 같이 플레이하기를 신청한 횟수 
$N$과 임스가 플레이할 게임의 종류가 주어질 때, 최대 몇 번이나 임스와 함께 게임을 플레이할 수 있는지 구하시오.

임스와 여러 번 미니게임을 플레이하고자 하는 사람이 있으나, 임스는 한 번 같이 플레이한 사람과는 다시 플레이하지 않습니다.

임스와 함께 플레이하고자 하는 사람 중 동명이인은 존재하지 않습니다. 임스와 lms0806은 서로 다른 인물입니다.

입력
첫 번째 줄에는 사람들이 임스와 같이 플레이하기를 신청한 횟수 
N과 같이 플레이할 게임의 종류가 주어진다. 
(1 <= N <= 100000)

두 번째 줄부터 
N개의 줄에는 같이 플레이하고자 하는 사람들의 이름이 문자열로 주어진다. 
(1 <= 문자열 길이 <= 20)

사람들의 이름은 숫자 또는 영문 대소문자로 구성되어 있다. 

예제 입력 
7 Y
lms0806
lms0806
exponentiale
lms0806
jthis
lms0806
leo020630

예제 출력 
4
*/ 