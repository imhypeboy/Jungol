package b2638;
//치즈 
import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[][] grid;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int time = 0;
        while (true) {
            visited = new boolean[n][m];
            bfsMarkOutsideAir();

            if (!meltCheese()) break;
            time++;
        }

        System.out.println(time);
    }

    static void bfsMarkOutsideAir() {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny] && grid[nx][ny] == 0) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }

    static boolean meltCheese() {
        List<int[]> toMelt = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    int contactCount = 0;

                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        if (nx >= 0 && nx < n && ny >= 0 && ny < m && visited[nx][ny]) {
                            contactCount++;
                        }
                    }

                    if (contactCount >= 2) {
                        toMelt.add(new int[]{i, j});
                    }
                }
            }
        }

        for (int[] pos : toMelt) {
            grid[pos[0]][pos[1]] = 0;
        }

        return !toMelt.isEmpty();
    }
}