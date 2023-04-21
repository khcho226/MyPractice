class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var idx1 = 0
        var idx2 = 0
        var result = "Yes"
        
        for (i in goal.indices) {
            if (idx1 < cards1.size && cards1[idx1] == goal[i]) {
                idx1++
            } else if (idx2 < cards2.size && cards2[idx2] == goal[i]) {
                idx2++
            } else {
                result = "No"
                break
            }
        }
        
        return result
    }
}