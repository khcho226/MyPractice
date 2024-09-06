class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        return num_list.toList().drop(n - 1).toIntArray()
    }
}