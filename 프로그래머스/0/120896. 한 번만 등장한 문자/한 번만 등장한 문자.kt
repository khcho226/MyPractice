class Solution {
    fun solution(s: String): String {
        return s.filter { c -> s.count { it == c } == 1 }.toCharArray().sorted().joinToString("")
    }
}