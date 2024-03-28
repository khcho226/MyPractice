class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        val hs = HashSet<String>()

        hs.addAll(s1)
        hs.addAll(s2)

        return s1.size + s2.size - hs.size
    }
}