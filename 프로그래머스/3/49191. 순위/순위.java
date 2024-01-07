class Solution {
    public int solution(int n, int[][] results) {
        int[][] arr = new int[n][n];
        int total = 0;
        
        for (int[] r : results) {
            arr[r[0] - 1][r[1] - 1] = 1;
            arr[r[1] - 1][r[0] - 1] = -1;
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j && arr[i][j] == 0 && arr[i][k] == 1 && arr[k][j] == 1) {
                        arr[i][j] = 1;
                        arr[j][i] = -1;
                        arr[j][k] = -1;
                        arr[k][i] = -1;
                    }
                }
            }
        }
        
        for (int[] a : arr) {
            int cnt = 0;
            
            for (int num : a) {
                if (num == 0) {
                    cnt++;
                }
            }
            
            if (cnt == 1) {
                total++;
            }
        }
        
        return total;
    }
}