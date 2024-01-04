import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        Queue<int[]> q = new LinkedList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
        int time = 0;
        int answer = 0;

        Arrays.sort(jobs, Comparator.comparingInt(o -> o[0]));

        for (int[] j : jobs) {
            q.offer(j);
        }

        while (!q.isEmpty() || !pq.isEmpty()) {
            while (!q.isEmpty() && q.peek()[0] <= time) {
                pq.offer(q.poll());
            }

            if (!pq.isEmpty()) {
                int[] job = pq.poll();

                time += job[1];
                answer += time - job[0];
            } else {
                time = q.peek()[0];
            }
        }

        return answer / jobs.length;
    }
}