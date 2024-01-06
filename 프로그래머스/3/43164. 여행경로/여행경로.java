import java.util.*;

class Solution {
    ArrayList<String> arr = new ArrayList<>();
    
    public String[] solution(String[][] tickets) {
        boolean[] visited = new boolean[tickets.length];

        dfs(0, tickets, visited, "ICN", "ICN");
        Collections.sort(arr);

        return arr.get(0).split(" ");
    }
    
    public void dfs(int cnt, String[][] tickets, boolean[] visited, String p1, String p2) {
        if (cnt == tickets.length) {
            arr.add(p1);
        } else {
            for (int i = 0; i < tickets.length; i++) {
                if (!visited[i] && tickets[i][0].equals(p2)) {
                    visited[i] = true;
                    dfs(cnt + 1, tickets, visited, p1 + " " + tickets[i][1], tickets[i][1]);
                    visited[i] = false;
                }
            }
        }
    }
}