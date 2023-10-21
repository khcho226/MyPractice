import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] days = new int[100];
        int day = 0;
        
        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + day * speeds[i] < 100) {
                day++;
            }
            
            days[day]++;
        }
        
        return Arrays.stream(days).filter(i -> i != 0).toArray();
    }
}