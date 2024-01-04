import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        int cnt = k;

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);

            while (!stack.isEmpty() && stack.peek() < c && cnt > 0) {
                stack.pop();
                cnt--;
            }

            stack.push(c);
        }

        for (int i = 0; i < cnt; i++) {
            stack.pop();
        }
        
        int size = stack.size();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < size; i++) {
            answer.insert(0, stack.pop());
        }

        return answer.toString();
    }
}