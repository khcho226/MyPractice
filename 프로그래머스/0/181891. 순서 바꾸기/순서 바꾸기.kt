class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        return (num_list.drop(n) + num_list.take(n)).toIntArray()
    }
}