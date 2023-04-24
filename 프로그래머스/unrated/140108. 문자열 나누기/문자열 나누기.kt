class Solution {
    fun solution(s: String): Int {
        var char = s[0]
        var cntOrig = 0
        var cntDiff = 0
        var answer = 0
        
        s.forEachIndexed { idx, it ->
            if (it == char) {
                cntOrig++
            } else {
                cntDiff++
            }
            
            if (cntOrig == cntDiff && idx != s.length - 1) {
                char = s[idx + 1]
                answer++
            }
        }
        
        return answer + 1
    }
}