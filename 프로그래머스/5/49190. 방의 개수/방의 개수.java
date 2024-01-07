import java.util.*;

class Solution {
    public int solution(int[] arrows) {
        int[] now = {0, 0};
        int[][] dirs = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};
        Queue<int[]> que = new LinkedList<>();
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        int answer = 0;

        que.offer(new int[]{0, 0});

        for (int arrow : arrows) {
            for (int i = 0; i < 2; i++) {
                int[] next = {now[0] + dirs[arrow][0], now[1] + dirs[arrow][1]};

                que.offer(next);
                now = next;
            }
        }

        now = que.poll();
        set1.add(now[0] + " " + now[1]);

        while (!que.isEmpty()) {
            int[] next = que.poll();
            String sNow = now[0] + " " + now[1];
            String sNext = next[0] + " " + next[1];

            if (set1.contains(sNext) && !set2.contains(sNow + " " + sNext)) {
                answer++;
            } else {
                set1.add(sNext);
            }

            set2.add(sNow + " " + sNext);
            set2.add(sNext + " " + sNow);
            now = next;
        }

        return answer;
    }
}