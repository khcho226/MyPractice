class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        return num_list.filterIndexed { idx, _ ->
            idx % n == 0   
        }.toIntArray()
    }
}