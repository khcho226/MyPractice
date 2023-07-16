class Solution {
    fun solution(sequence: IntArray, k: Int): IntArray {
        var arr = intArrayOf(0, sequence.size - 1)
        var l = 0
        var r = 0
        var sum = sequence[0]

        while (l < sequence.size) {
            if (sum < k) {
                if (r == sequence.size - 1) {
                    break
                }

                sum += sequence[++r]
            } else {
                if (sum == k && arr[0] - arr[1] < l - r) {
                    arr = intArrayOf(l, r)
                }

                sum -= sequence[l++]
            }
        }

        return arr
    }
}