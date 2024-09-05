import kotlin.math.*

class Solution {
    fun solution(n: Int): Int {
        return if (sqrt(n.toDouble()) % 1 == 0.0) {
            1
        } else {
            2
        }
    }
}