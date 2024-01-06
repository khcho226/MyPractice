import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        Queue<int[]> que = new LinkedList<>();
        int lenRow = maps.length;
        int lenCol = maps[0].length;
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        que.offer(new int[]{0, 0, 1});

        while (!que.isEmpty()) {
            int[] temp = que.poll();
            int row = temp[0];
            int col = temp[1];
            int dis = temp[2];

            if (row == lenRow - 1 && col == lenCol - 1) {
                return dis;
            }

            for (int[] dir : dirs) {
                int nRow = row + dir[0];
                int nCol = col + dir[1];

                if (0 <= nRow && nRow < lenRow && 0 <= nCol && nCol < lenCol && maps[nRow][nCol] == 1) {
                    maps[nRow][nCol] = 0;
                    que.offer(new int[]{nRow, nCol, dis + 1});
                }
            }
        }

        return -1;
    }
}