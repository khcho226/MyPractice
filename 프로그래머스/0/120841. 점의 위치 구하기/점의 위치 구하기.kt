class Solution {
    fun solution(dot: IntArray): Int {
        return if (dot[0] > 0) {
            if (dot[1] > 0) {
                1
            } else {
                4
            }
        } else {
            if (dot[1] > 0) {
                2
            } else {
                3
            }
        }
    }
}