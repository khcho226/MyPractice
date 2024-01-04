import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] patterns = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] score = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (patterns[i][j % patterns[i].length] == answers[j]) {
                    score[i]++;
                }
            }
        }

        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            if (score[i] == maxScore) {
                arr.add(i + 1);
            }
        }

        return arr.stream().mapToInt(i -> i).toArray();
    }
}