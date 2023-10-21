import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int n: arr) {
            if (stack.size() == 0 || stack.peek() != n) {
                stack.push(n);
            }
        }

        int s = stack.size();
        int[] answer = new int[s];
        
        for (int i = 0; i < s; i++) {
            answer[s - i - 1] = stack.pop();
        }

        return answer;
    }
}