import java.util.*;

class Solution {
    public int solution(String arr[]) {
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<String> ops = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                nums.add(Integer.parseInt(arr[i]));
            } else {
                ops.add(arr[i]);
            }
        }

        int len = nums.size();
        int[][] maxArr = new int[len][len];
        int[][] minArr = new int[len][len];

        for (int i = 0; i < len; i++) {
            Arrays.fill(maxArr[i], Integer.MIN_VALUE);
            Arrays.fill(minArr[i], Integer.MAX_VALUE);
            maxArr[i][i] = minArr[i][i] = nums.get(i);
        }

        for (int s = 1; s < len; s++) {
            for (int i = 0; i < len - s; i++) {
                int j = s + i;

                for (int k = i; k < j; k++) {
                    if (ops.get(k).equals("+")) {
                        maxArr[i][j] = Math.max(maxArr[i][j], maxArr[i][k] + maxArr[k + 1][j]);
                        minArr[i][j] = Math.min(minArr[i][j], minArr[i][k] + minArr[k + 1][j]);
                    } else {
                        maxArr[i][j] = Math.max(maxArr[i][j], maxArr[i][k] - minArr[k + 1][j]);
                        minArr[i][j] = Math.min(minArr[i][j], minArr[i][k] - maxArr[k + 1][j]);
                    }
                }
            }
        }

        return maxArr[0][len - 1];
    }
}