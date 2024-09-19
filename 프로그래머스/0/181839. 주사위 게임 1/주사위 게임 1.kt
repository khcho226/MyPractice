import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int): Int {
        return if (a % 2 == 0 && b % 2 == 0) {
            abs(a - b)
        } else if (a % 2 == 1 && b % 2 == 1) {
            a * a + b * b
        } else {
            2 * (a + b)
        }
    }
}