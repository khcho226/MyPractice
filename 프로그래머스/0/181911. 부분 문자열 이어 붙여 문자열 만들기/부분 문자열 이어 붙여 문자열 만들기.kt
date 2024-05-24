class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        return my_strings.mapIndexed { idx, it ->
            it.slice(parts[idx][0]..parts[idx][1])
        }.joinToString("")
    }
}