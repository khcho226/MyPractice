class Solution {
    fun solution(n: Int, times: IntArray): Long {
        var answer = 0L
        var left = 0L
        var right = n.toLong() * times.maxOrNull()!!

        while (left <= right) {
            val mid = (left + right) / 2

            if (times.fold(0L) { total, num -> total + mid / num } >= n) {
                answer = mid
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

        return answer
    }
}