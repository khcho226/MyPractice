class Solution {
    fun solution(age: Int): String {
        return age.toString().map { (it.toInt() + 49).toChar() }.joinToString("")
    }
}