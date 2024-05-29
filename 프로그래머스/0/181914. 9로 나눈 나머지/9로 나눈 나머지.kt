class Solution {
    fun solution(number: String): Int {
        return number.fold(0) { total, num -> total + (num - '0') } % 9
    }
}