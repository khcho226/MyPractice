import java.util.*;

class Solution {
    public int solution(int N, int number) {
        ArrayList<HashSet<Integer>> arr = new ArrayList<>();
        int n = N;
        int answer = -1;

        for (int i = 1; i < 9; i++) {
            HashSet<Integer> set = new HashSet<>();

            set.add(n);
            n = n * 10 + N;

            for (int j = 0; j < i - 1; j++) {
                for (int op1 : arr.get(j)) {
                    for (int op2 : arr.get(arr.size() - j - 1)) {
                        set.add(op1 + op2);
                        set.add(op1 - op2);
                        set.add(op1 * op2);

                        if (op2 != 0) {
                            set.add(op1 / op2);
                        }
                    }
                }
            }

            if (set.contains(number)) {
                answer = i;
                break;
            }

            arr.add(set);
        }

        return answer;
    }
}