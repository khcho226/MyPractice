class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        return strArr.toList().filter { it.contains("ad").not() }.toTypedArray()
    }
}