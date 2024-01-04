import java.util.*;

class Solution {
    public class Process {
        private final int priority;
        private final int idx;
        
        public Process(int priority, int idx) {
            this.priority = priority;
            this.idx = idx;
        }
    }
    
    public int solution(int[] priorities, int location) {
        Queue<Process> que1 = new LinkedList<>();
        PriorityQueue<Integer> que2 = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for (int i = 0; i < priorities.length; i++) {
            que1.offer(new Process(priorities[i], i));
            que2.offer(priorities[i]);
        }

        while (true) {
            Process process = que1.poll();

            if (process.priority < que2.peek()) {
                que1.offer(process);
                continue;
            }

            que2.poll();
            answer++;

            if (process.idx == location) {
                break;
            }
        }

        return answer;
    }
}