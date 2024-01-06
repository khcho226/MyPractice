import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long l = 0;
        long r = (long) n * Arrays.stream(times).max().getAsInt();
        long answer = 0;

        while (l <= r) {
            long total = 0;
            long mid = (l + r) / 2;

            for (int time : times) {
                total += mid / time;
            }

            if (total >= n) {
                r = mid - 1;
                answer = mid;
            } else {
                l = mid + 1;
            }
        }

        return answer;
    }
}