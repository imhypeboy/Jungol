package b9017;
import java.io.*;
import java.util.*;

public class Main2 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 팀 정보를 저장할 클래스
    static class Team {
        int totalScore = 0; // 상위 4명의 점수 합계
        int fifthScore = Integer.MAX_VALUE; // 5번째 선수 점수
        int playerCount = 0; // 선수 수
    }

    private static void solve() throws IOException {
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Team> teams = new HashMap<>(); // 팀 정보를 저장

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            int teamId = Integer.parseInt(st.nextToken());
            teams.putIfAbsent(teamId, new Team());
            Team team = teams.get(teamId);

            team.playerCount++;
            if (team.playerCount <= 4) {
                team.totalScore += i; // 상위 4명 점수 합산
            } else if (team.playerCount == 5) {
                team.fifthScore = i; // 5번째 선수 점수
            }
        }

        int bestTeam = 0;
        int bestScore = Integer.MAX_VALUE;
        int bestFifth = Integer.MAX_VALUE;

        // 조건에 따라 최적 팀 결정
        for (Map.Entry<Integer, Team> entry : teams.entrySet()) {
            int teamId = entry.getKey();
            Team team = entry.getValue();

            // 6명 이상인 팀만 유효
            if (team.playerCount >= 6) {
                if (team.totalScore < bestScore || 
                   (team.totalScore == bestScore && team.fifthScore < bestFifth)) {
                    bestTeam = teamId;
                    bestScore = team.totalScore;
                    bestFifth = team.fifthScore;
                }
            }
        }

        System.out.println(bestTeam);
    }

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            solve();
        }
    }
}
