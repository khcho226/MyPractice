class Solution {
    fun solution(number: IntArray): Int {
       var cnt = 0

        for (i in number.indices) {
            for (j in i + 1 until number.size) {
                for (k in j + 1 until number.size) {
                    if (number[i] + number[j] + number[k] == 0) {
                        cnt++
                    }
                }
            }
        }

        return cnt
    }
}