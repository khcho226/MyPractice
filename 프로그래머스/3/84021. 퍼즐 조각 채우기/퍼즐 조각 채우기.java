import java.util.*;

class Solution {
    public int solution(int[][] game_board, int[][] table) {
        int len = game_board.length;
        ArrayList<ArrayList<int[]>> arr = new ArrayList<>();
        int answer = 0;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (game_board[i][j] == 0) {
                    arr.add(dfs(game_board, i, j, 0, 0, len, 0));
                }
            }
        }

        for (int r = 0; r < 4; r++) {
            int[][] copiedTable = new int[len][len];

            for (int i = 0; i < len; i++) {
                System.arraycopy(table[i], 0, copiedTable[i], 0, len);
            }

            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    if (copiedTable[i][j] == 1) {
                        ArrayList<int[]> nArr = dfs(copiedTable, i, j, 0, 0, len, 1);
                        boolean flag1 = true;

                        for (int a = 0; a < arr.size(); a++) {
                            ArrayList<int[]> temp = arr.get(a);
                            boolean flag2 = true;

                            if (nArr.size() != temp.size()) {
                                continue;
                            }

                            for (int k = 0; k < nArr.size(); k++) {
                                if (nArr.get(k)[0] != temp.get(k)[0] || nArr.get(k)[1] != temp.get(k)[1]) {
                                    flag2 = false;
                                    break;
                                }
                            }

                            if (flag2) {
                                for (int k = 0; k < len; k++) {
                                    System.arraycopy(copiedTable[k], 0, table[k], 0, len);
                                }
                                
                                arr.remove(a);
                                answer += nArr.size();
                                flag1 = false;
                                break;
                            }
                        }

                        if (flag1) {
                            for (int k = 0; k < len; k++) {
                                System.arraycopy(table[k], 0, copiedTable[k], 0, len);
                            }
                        }
                    }
                }
            }

            if (r < 3) {
                int[][] nTable = new int[len][len];

                for (int i = 0; i < len; i++) {
                    for (int j = 0; j < len; j++) {
                        nTable[i][j] = table[len - j - 1][i];
                    }
                }

                for (int i = 0; i < len; i++) {
                    System.arraycopy(nTable[i], 0, table[i], 0, len);
                }
            }
        }

        return answer;
    }
    
    public ArrayList<int[]> dfs(int[][] board, int x, int y, int px, int py, int len, int num) {
        ArrayList<int[]> arr = new ArrayList<>();
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        board[x][y] = 2;
        arr.add(new int[]{px, py});

        for (int[] dir : dirs) {
            int nx = x + dir[0];
            int ny = y + dir[1];

            if (0 <= nx && nx < len && 0 <= ny && ny < len) {
                if (board[nx][ny] == num) {
                    arr.addAll(dfs(board, nx, ny, px + dir[0], py + dir[1], len, num));
                }
            }
        }

        return arr;
    }
}