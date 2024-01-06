import java.util.*;

class Solution {
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int[][] arr = new int[102][102];

        for (int[] r : rectangle) {
            int x1 = r[0] * 2;
            int y1 = r[1] * 2;
            int x2 = r[2] * 2;
            int y2 = r[3] * 2;

            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j <= y2; j++) {
                    if (x1 < i && i < x2 && y1 < j && j < y2) {
                        arr[i][j] = 1;
                    } else if (arr[i][j] != 1) {
                        arr[i][j] = 2;
                    }
                }
            }
        }

        Queue<int[]> que = new LinkedList<>();
        int[][] visited = new int[102][102];
        int sx = characterX * 2;
        int sy = characterY * 2;
        int ex = itemX * 2;
        int ey = itemY * 2;
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        que.offer(new int[]{sx, sy});
        
        for (int i = 0; i < 102; i++) {
            Arrays.fill(visited[i], 1);
        }

        while (true) {
            int[] temp = que.poll();
            int x = temp[0];
            int y = temp[1];

            if (x == ex && y == ey) {
                return visited[x][y] / 2;
            }

            for (int[] dir : dirs) {
                int nx = x + dir[0];
                int ny = y + dir[1];

                if (arr[nx][ny] == 2 && visited[nx][ny] == 1) {
                    que.offer(new int[]{nx, ny});
                    visited[nx][ny] += visited[x][y];
                }
            }
        }
    }
}