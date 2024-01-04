import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        Queue<Integer> waiting = new LinkedList<>();
        int total = 0;
        int answer = 0;

        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }

        for (int t : truck_weights) {
            waiting.offer(t);
        }

        while (!bridge.isEmpty()) {
            total -= bridge.poll();
            answer++;

            if (!waiting.isEmpty()) {
                if (total + waiting.peek() <= weight) {
                    total += waiting.peek();
                    bridge.add(waiting.poll());
                } else {
                    bridge.add(0);
                }
            }
        }

        return answer;
    }
}