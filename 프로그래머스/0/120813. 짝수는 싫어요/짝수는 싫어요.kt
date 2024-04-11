class Solution {
    fun solution(n: Int): IntArray {
        return IntArray((n + 1) / 2) { it * 2 + 1 }
    }
}