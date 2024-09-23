class Solution {
    fun solution(my_string: String): String {
        return my_string.replace("a|e|i|o|u".toRegex(), "")
    }
}