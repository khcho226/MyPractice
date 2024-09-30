class Solution {
    fun solution(myString: String): String {
        return myString.replace("[a-k]".toRegex(), "l")
    }
}