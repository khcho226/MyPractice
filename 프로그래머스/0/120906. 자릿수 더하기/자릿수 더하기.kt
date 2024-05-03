class Solution {
    fun solution(n: Int): Int {
        return n.toString().fold(0) { total, num -> total + (num - '0') }
    }
}