class Solution {
    fun solution(my_string: String, m: Int, c: Int): String {
        return my_string.filterIndexed { idx, _ -> idx % m == c - 1 }
    }
}