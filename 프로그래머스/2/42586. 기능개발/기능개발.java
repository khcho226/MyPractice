import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int idx = 1;
        int[] days = new int[100];
        
        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + idx * speeds[i] < 100) {
                idx++;
            }
            
            days[idx]++;
        }
        
        return Arrays.stream(days).filter(i -> i != 0).toArray();
    }
}