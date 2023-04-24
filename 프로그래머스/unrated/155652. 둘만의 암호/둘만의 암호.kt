class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        val chars = ('a'..'z').filter { it !in skip.toList() }
        var answer = ""

        s.forEach { answer += chars[(chars.indexOf(it) + index) % chars.size] }

        return answer    
    }
}