import kotlin.math.*

class Solution {  
    fun solution(n: Int, k: Int): Int {    
        var answer = 0
        
        n.toString(k).split("0").forEach {
            if (it.isNotBlank() && isPrime(it.toLong())) {
                answer++
            }
        }
        
        return answer
    }
    
    fun isPrime(num: Long): Boolean {
        if (num <= 1) {
            return false
        }
        
        return (2..sqrt(num.toDouble()).toInt()).none {
            num % it == 0L
        }
    }
}