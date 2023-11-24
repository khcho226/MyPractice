class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        val rank = intArrayOf(6, 6, 5, 4, 3, 2, 1)
        var zero = 0
        var correct = 0

        lottos.forEach {
            if (it == 0) {
                zero++
            } else if (win_nums.contains(it)) {
                correct++
            }
        }

        return intArrayOf(rank[zero + correct], rank[correct])
    }
}