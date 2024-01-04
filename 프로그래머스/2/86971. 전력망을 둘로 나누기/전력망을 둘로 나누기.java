import java.util.*;

class Solution {
    int[][] graph;
    
    public int solution(int n, int[][] wires) {
        int answer = n;

        graph = new int[n + 1][n + 1];

        for (int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];

            graph[a][b] = graph[b][a] = 1;
        }

        for (int[] wire : wires) {
            answer = Math.min(answer, Math.abs(bfs(n, wire[0], wire[1]) * 2 - n));
        }

        return answer;
    }
    
    int bfs(int n, int start, int end) {
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();

        arr.add(start);

        for (int i = 1; i <= n; i++) {
            if (graph[start][i] == 1 && i != end) {
                arr.add(i);
                que.offer(i);
            }
        }

        while (!que.isEmpty()) {
            int[] temp = graph[que.poll()];

            for (int i = 1; i <= n; i++) {
                if (temp[i] == 1 && i != end && !arr.contains(i)) {
                    arr.add(i);
                    que.offer(i);
                }
            }
        }

        return arr.size();
    }
}