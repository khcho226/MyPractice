class Solution {
    fun solution(n: Int): Int {
        var num = 1
        var sum = 0
        
        if (n % 2 == 1) {
            while (num <= n) {
                sum += num
                num += 2
            }
        } else {
            num++
            
            while (num <= n) {
                sum += num * num
                num += 2
            }
        }
        
        return sum
    }
}