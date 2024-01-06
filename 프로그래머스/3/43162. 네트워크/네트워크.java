class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(visited, i, n, computers);
                answer++;
            }
        }

        return answer;
    }
    
    public void dfs(boolean[] visited, int start, int n, int[][] computers) {
        visited[start] = true;

        for (int i = 0; i < n; i++) {
            if (!visited[i] && computers[start][i] == 1) {
                dfs(visited, i, n, computers);
            }
        }
    }
}