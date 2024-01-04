import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int j = stack.pop();

                answer[j] = i - j;
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int i = stack.pop();

            answer[i] = prices.length - i - 1;
        }

        return answer;
    }
}