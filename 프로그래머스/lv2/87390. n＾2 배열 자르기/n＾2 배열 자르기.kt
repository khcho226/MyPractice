class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        return mutableListOf<Int>().also {
            for (i in left..right) {          
                it.add(maxOf(i / n, i % n).toInt() + 1)
            }
        }.toIntArray()
    }
}