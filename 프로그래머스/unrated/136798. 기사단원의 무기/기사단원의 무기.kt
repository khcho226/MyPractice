class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var num: Int
        var answer = 0
        
        for (i in 1..number) {
            num = (1..(i / 2)).count { i % it == 0 } + 1
            
            answer += if (num <= limit) {
                num
            } else {
                power
            }
        }
        
        return answer
    }
}