import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int camera = -30001;
        int answer = 0;

        Arrays.sort(routes, Comparator.comparingInt(o -> o[1]));

        for (int[] route : routes) {
            if (camera < route[0]) {
                camera = route[1];
                answer++;
            }
        }

        return answer;
    }
}