import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        Queue<int[]> que = new LinkedList<>();
        ArrayList<Integer>[] graph = new ArrayList[n + 1];
        int[] visited = new int[n + 1];

        que.offer(new int[]{1, 1});

        for (int[] e : edge) {
            if (graph[e[0]] == null) {
                graph[e[0]] = new ArrayList<>();
            }

            if (graph[e[1]] == null) {
                graph[e[1]] = new ArrayList<>();
            }

            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        visited[1] = 1;

        while (!que.isEmpty()) {
            int[] now = que.poll();

            for (int g : graph[now[0]]) {
                if (visited[g] == 0) {
                    que.offer(new int[]{g, now[1] + 1});
                    visited[g] = now[1] + 1;
                }
            }
        }

        int max = Arrays.stream(visited).max().getAsInt();
        int cnt = 0;

        for (int v : visited) {
            if (v == max) {
                cnt++;
            }
        }

        return cnt;
    }
}