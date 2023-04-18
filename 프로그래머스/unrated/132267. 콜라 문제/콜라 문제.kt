class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var quotient = 0
        var total = n
        var answer = 0
        
        while (total >= a) {
            quotient = total / a
            total = b * quotient + total % a
            answer += b * quotient
        }
        
        return answer
    }
}