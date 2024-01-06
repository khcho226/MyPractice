import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        int[] nRocks = new int[rocks.length + 1];
        int l = 0;
        int r = distance;
        
        Arrays.sort(rocks);
        System.arraycopy(rocks, 0, nRocks, 0, rocks.length);
        nRocks[rocks.length] = distance;

        while (l <= r) {
            int mid = (l + r) / 2;
            int now = 0;
            int cnt = 0;

            for (int rock : nRocks) {
                if (rock - now < mid) {
                    cnt++;
                } else {
                    now = rock;
                }
            }

            if (cnt <= n) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return r;
    }
}