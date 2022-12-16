import kotlin.collections.max

class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        return sizes.maxOf { maxOf(it[0], it[1]) } * sizes.maxOf { minOf(it[0], it[1]) }
    }
}