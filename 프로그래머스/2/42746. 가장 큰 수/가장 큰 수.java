import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] nums = new String[numbers.length];
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(nums, ((o1, o2) -> (o2 + o1).compareTo(o1 + o2)));

        for (String n : nums) {
            answer.append(n);
        }

        return answer.charAt(0) == '0' ? "0" : answer.toString();
    }
}