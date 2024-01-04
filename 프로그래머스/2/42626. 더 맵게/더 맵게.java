import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        int answer = 0;

        for (int s : scoville) {
            que.offer(s);
        }

        while (true) {
            int now = que.poll();

            if (now >= K) {
                return answer;
            }

            if (que.isEmpty()) {
                return -1;
            }

            que.offer(now + que.poll() * 2);
            answer++;
        }
    }
}