class Solution {
    fun solution(n: Int): Int {
        return n / gcd(n, 6)
    }
    
    fun gcd(a: Int, b: Int): Int {
        return if (b != 0) {
            gcd(b, a % b)
        } else {
            a
        }
    }
}