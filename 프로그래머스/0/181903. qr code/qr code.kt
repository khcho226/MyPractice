class Solution {
    fun solution(q: Int, r: Int, code: String): String {
        return code.filterIndexed { idx, _ -> idx % q == r }
    }
}