class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        return (1..yellow).filter { yellow % it == 0 }
            .first { brown == 2 * (yellow / it + it + 2) }
            .let { intArrayOf(yellow / it + 2, it + 2) }
    }
}