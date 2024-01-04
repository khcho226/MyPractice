import java.util.*;

class Solution {
    ArrayList<String> arr = new ArrayList<>();
    
    public int solution(String word) {
        dfs("", 0);

        return arr.indexOf(word);
    }
    
    public void dfs(String str, int depth) {
        if (depth > 5) {
            return;
        }

        arr.add(str);

        for (int i = 0; i < 5; i++) {
            dfs(str + "AEIOU".charAt(i), depth + 1);
        }
    }
}