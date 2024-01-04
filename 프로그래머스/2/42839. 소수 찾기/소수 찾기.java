import java.util.*;

class Solution {
    public int solution(String numbers) {
        HashSet<Integer> set = new HashSet<>();
        int answer = 0;

        permutation("", numbers, set);

        while (set.iterator().hasNext()) {
            int n = set.iterator().next();

            set.remove(n);

            if (isPrime(n)) {
                answer++;
            }
        }

        return answer;
    }
    
    public void permutation(String prefix, String str, HashSet<Integer> set) {
        if (!prefix.equals("")) {
            set.add(Integer.parseInt(prefix));
        }

        for (int i = 0; i < str.length(); i++) {
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1), set);
        }
    }
    
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}