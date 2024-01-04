import java.util.*;

class Solution {
    public int solution(int n, int[][] costs) {
        HashSet<Integer> set = new HashSet<>();
        int answer = 0;

        Arrays.sort(costs, Comparator.comparingInt(o -> o[2]));
        set.add(costs[0][0]);

        while (set.size() != n) {
            for (int[] cost : costs) {
                if ((set.contains(cost[0]) && !set.contains(cost[1])) || (!set.contains(cost[0]) && set.contains(cost[1]))) {
                    set.add(cost[0]);
                    set.add(cost[1]);
                    answer += cost[2];
                    break;
                }
            }
        }

        return answer;
    }
}