class Solution {
    fun solution(num_str: String): Int {
        return num_str.map { it - '0' }.sum()
    }
}